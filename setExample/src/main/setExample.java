package main;
import java.util.*;

public class setExample {
	public static void main(String [] args) {
		
		HashSet<String> set1 = new HashSet<String>();
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		TreeSet<String> set3 = new TreeSet<String>();
		
		set1.add("EB");
		set1.add("DC");
		set1.add("HD");
		set1.add("WP");
		
		set2.add("EB");
		set2.add("HD");
		set2.add("DC");
		set2.add("WP");
		
		set3.add("WP");
		set3.add("EB");
		set3.add("DC");
		set3.add("HD");
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
