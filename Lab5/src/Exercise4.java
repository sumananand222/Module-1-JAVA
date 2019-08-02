import java.util.Scanner;

public class Exercise4 extends RuntimeException{
	
	public Exercise4(String msg) {
		super(msg);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String fname = sc.nextLine();
		System.out.println("Enter Last Name:");
		String lname = sc.next();
		
		try {
			if(fname.isEmpty() || lname.isEmpty())
			{
				throw new Exercise4("Empty fname / lname please insert correct string!!!");
			}
			else
			{
				System.out.println("Success!!!!");
			}
		}
		catch(Exercise4 e){
			System.out.println("Please do not leave any fields blank!!!");
		}
	}
	

}
