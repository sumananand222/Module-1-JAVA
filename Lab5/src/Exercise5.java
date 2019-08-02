import java.util.Scanner;

public class Exercise5 extends RuntimeException {
	
	public Exercise5(String msg) {
		super(msg);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:-");
		int age = sc.nextInt();
		
		try {
			if(age<=15) {
				throw new Exercise5("Age under 15!!!");
			}
			else
			{
				System.out.println("Success!!!");
			}
		}
			catch(Exercise5 e)
			{
				System.out.println("Age is under 15...");
			}
		}
		
	}
