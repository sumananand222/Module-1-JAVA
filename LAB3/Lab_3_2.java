import java.util.Arrays;

public class Lab_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] obj=new String[] {"Cat","Horse","Camel","Dog","Bat"};
			covert(obj);
			String[] result=covert(obj);
			for(int i=0;i<result.length;i++) System.out.println(result[i]);
	}
	public static String[] covert(String[] a) {
		int len=a.length;
		Arrays.sort(a);
		for(int i=0;i<len;i++) {
			if(i<(len/2)+1) {
				a[i]=a[i].toUpperCase();
				
			}
			else {
				a[i]=a[i].toLowerCase();
			}
		}
		return a;
	}

	
}
