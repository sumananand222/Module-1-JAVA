//Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers

package ex2;

public class DiffSquare {
	static double calculateDiff(double n) {
		double diff=0;
		diff=(n*(n+1)*(2*n+1))/6 - Math.pow(((n*(n+1))/2),2 );
		
		return Math.abs(diff);
	}
	public static void main(String[] args) {
		System.out.println(calculateDiff(10));
		
	}
}
