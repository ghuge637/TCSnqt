/******************************************************************************
Bob is going to bet today on horse riding. There are N horses listed in a sequence of
1 to N.
The probability of winning of each horse is different so the prices for making a bet
on the horses are not the same. There is no limit on the number of horses on which
he can bet, but he thinks that if he bets on a continuous sequence of horses then he
has a better chance to win. Bob will get K units of money if any horse on which he
bets will win. But as the award is only K units so he wants to put money less than K.
Bob wants to bet on as many horses as he can. As you are his best friend, he
reached out to you for help, can you please find the length of the maximum
continuous sequence of horses on which Bob can make a bet, and remember he will
invest money less than K units. If there are more than one possible combinations,
Bob will bet randomly on any one of them.
Given the number of horses(N), reward money(K), and price of betting on N horses in
order.
Hint: For each starting index of a horse, its end index in sequences will be equal to or
greater than the end index of the previous starting index.

Input:
90 100 -> N = 10, K=100
30 40 50 20 20 10 90 10 10 10 -> Price to make bet on each horse in order
• Output:
3
• Explanation:
There are 10 horses, and the reward money is 100. So, Bob will put money less than 100.
There are two possible o sequences of length three whose total money for betting is less
than 100, i.e. [50 20 20] (sum is 90) and [10 10 10] (sum is 30). Bob will choose randomly
one sequence from these two. As none of the other sequences with length greater than 3
will have a price less than 100 so the answer will be 3.

*******************************************************************************/
public class PAPER5
{
	public static void main(String[] args) {
	    int[] arr = {30, 40, 50, 20, 20, 10, 90, 10, 10, 10};
	   // int[] arr = {10, 90, 80, 20, 90, 60, 40, 60, 70, 75};
	    int sum = 0;
	    int output = 0, k =100,count = 0;
	    
	    for( int i=0; i<arr.length;i++){
	        sum += arr[i];
	        
	        if(sum < k){
	            output++;
	        }else{
	            sum = arr[i];
	            output = 1;
	        }
	        if(output > count){
	            count = output;
	        }
	    }
		System.out.println(count);
	}
}
