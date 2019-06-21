//Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

//Calculate the sum of first n natural numbers which are divisible by 3 or 5.

package ex1;

public class NaturalSum {
	public static int calculateSum(int n) {
		int sum=0, i=1, count=0;
		if(n>=1) {
			for(; (count<n)  ;i++) {
				if(i%3==0 || i%5==0) {
					sum+=i;
					count++;
				}
			}
	
		}
		else
			System.out.println("Enter number greater than 0!");
		//System.out.println(count);
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculateSum(3));
		
	}
}
