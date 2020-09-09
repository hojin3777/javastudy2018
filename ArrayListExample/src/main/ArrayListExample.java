package main;
import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //String type의 list 생성
		
		list.add("Java");
		list.add("ABCD");
		list.add("Korea");
		list.add(2,"Digital");
		list.add("High");
		list.add("High");
		//순서대로 list에 data 추가.
		
		int size = list.size(); //list의 사이즈 카운트, 데이터 갯수 세기
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		list.remove("High");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}
}
