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
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.println("���̵� : ");
			String id = scan.next();
			
			System.out.println("��й�ȣ : ");
			String password = scan.next();
			
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
				System.out.println();
			}
		}
	}
}
