package main;
import java.util.*;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		scores.put(90, "���翵");
		scores.put(65, "��ȣ��"); //Integer ����� ���� �Է��ϴ� ���
		scores.put(new Integer(85), "������"); //���� ��ü�� ������ �Է��ϴ� ���
		scores.put(new Integer(97), "�̰���");
		scores.put(new Integer(75), "�輺��");
		scores.put(new Integer(80), "������");
		
		Map.Entry<Integer, String> entry = null; //�Ź� ���ο� ���� �ֱ� ���Ͽ� �����ϴ� ��.
		
		entry = scores.firstEntry(); //Ű���� ���� ���� ���
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry(); //Ű���� ���� ���� ���
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(95); //�־��� Ű���� �ٷ� �Ʒ��� entry (�̸�)
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(95)); //�־��� Ű���� �ٷ� ���� entry (�ʰ�)
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.floorEntry(new Integer(95)); //�־��� Ű���� �ִٸ� �ش� entry ���ٸ� �ٷ� �Ʒ�(����)
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(84)); //�־��� Ű���� �ִٸ� �ش� entry ���ٸ� �ٷ� ��(�̻�)
		System.out.println(entry.getKey() + "-" + entry.getValue());
	}
}
