import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Exercise1 {
	public static void main(String[] args) {
		String path = "C:\\Users\\Rohit Sammanwar\\Desktop\\Try.txt";
		File f = new File(path);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(f.exists())
		{
			StringTokenizer token = new StringTokenizer(path, path);
		}
		else
		{
			System.out.println("File Does'nt Exists!!!");
		}
	}
}
