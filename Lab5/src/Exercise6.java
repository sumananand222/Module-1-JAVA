import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Exercise6 extends EmployeeException{
	
	public Exercise6(String message) {
		super(message);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of the employee...");
		long sal = sc.nextLong();
		
		try {
			if(sal<3000) {
				throw new Exercise6("Low Salary!!!");
			}
			else
			{
				System.out.println("Success!!!");
			}
		}
		catch(Exercise6 e) {
			System.out.println("Salary is < 3000!!!");
		}
	}

}
