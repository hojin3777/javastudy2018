package main;


public class ��� {
	public static void main(String[] args) {
	
	String target ="Here is Korea Digital Media High School";
	
	System.out.println(target.concat(" and Here is Ansan"));
	System.out.println(target.substring(11)); //H�� 0���� ����
	System.out.println(target.substring(11,16)); //�����ε���-1 ���� ���
	System.out.println(target.replace('o','0'));
	System.out.println(target.replace("Here","My Name"));
	System.out.println(target.toLowerCase());
	System.out.println(target.toUpperCase());
	System.out.println("");//-------------------------------------------------
	String coffee1 = "Americano"; //���� ���� ����Ŵ
	String coffee2 = "Americano";
	System.out.println("coffee1 and coffee2 : " + ((coffee1 == coffee2) ? "same" : "not same"));
	
	String coffee3 = new String("Americano"); //���� ���� ���̶� �ٸ�
	String coffee4 = new String("Americano"); //������ ��Ʈ���� ����Ŵ
	System.out.println("coffee3 and coffee4 : " + ((coffee3 == coffee4) ? "same" : "not same"));
	
	System.out.println(coffee1 + "," + System.identityHashCode(coffee1));
	System.out.println(coffee2 + "," + System.identityHashCode(coffee2));
	System.out.println(coffee3 + "," + System.identityHashCode(coffee3));
	System.out.println(coffee4 + "," + System.identityHashCode(coffee4));

	}
}