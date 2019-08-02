import java.util.Scanner;

public class Exercise5 {
	
	public boolean stringAcceptor(String str) {
		int flag = 0;
		
		for(int i = 0; i < str.length()-1;i++)
		{
			if(str.charAt(i)>str.charAt(i+1))
			{
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String!!!");
		String str = sc.next();
		Exercise5 ex = new Exercise5();
		
		boolean b = ex.stringAcceptor(str);
		if(b)
		{
			System.out.println("Positive...");
		}
		else
		{
			System.out.println("Negative...");
		}
		
	}

}
