package cg;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generic collection
//				Set<String> col= new HashSet<String>();
//				Set<String> col= new LinkedHashSet<String>();// ordered => maintains intertion order //No duplicates
//				Set<String> col= new TreeSet<String>();
				// does not accept 'null' as an object // throws NullPointerException // sorted elements// unordered collection
				List<String> col= new ArrayList<String>();
		
				col.add("Ram");
				col.add("Sham");
				col.add("Abdul");
			//	col.add(55);// new Integer(55);//autoboxing
			//	col.add(null);
				col.add("Ganesh");
				col.add("Ram");
				System.out.println(col.size());
				System.out.println(col);
				System.out.println("-------------------------------");
				
				for(String s: col) {
					System.out.println(s);
				}
				System.out.println("-------------------------------");
				
				Iterator<String> it = col.iterator();
				while(it.hasNext()) {
					String ss=it.next();
					System.out.println(ss);
					
				}
	}

}
