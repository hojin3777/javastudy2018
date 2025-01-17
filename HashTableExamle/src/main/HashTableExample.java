package main;
import java.util.*;

public class HashTableExample {
	public static void main(String[ ] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("Spring", "12");
		map.put("Summer", "123");
		map.put("Fall", "1234");
		map.put("Winter", "12345");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.println("아이디 : ");
			String id = scan.next();
			
			System.out.println("비밀번호 : ");
			String password = scan.next();
			
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
				System.out.println();
			}
		}
	}
}
