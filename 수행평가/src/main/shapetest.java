//### 2408 ��ȣ�� ###
//width - ����, length - ����, height - ����
package main;
import java.util.Scanner;

abstract class Shape{
	abstract public int getArea(int width, int length);
	abstract public int getCircum(int width, int length);
}

interface elseShape{
	public int getVolume(int width, int length, int height);
}

class Square extends Shape implements elseShape{
	public int getArea(int width, int length) {
		return width*length;
	}
	public int getCircum(int width, int length) {
		return width*2+length*2;
	}
	public int getVolume(int width, int length, int height) {
		return width*length*height;
	}
	
}


public class shapetest {
	public static void main(String[] args) {
		
		int width;
		int length;
		int height;
		int Area;
		int Circum;
		int Volume;
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���̸� �Է��ϼ���");
		width=scan.nextInt();
		System.out.println("������ ���̸� �Է��ϼ���");
		length=scan.nextInt();
		System.out.println("������ ���̸� �Է��ϼ���");
		height=scan.nextInt();
		
		Square t1 = new Square();
		
		Area=t1.getArea(width, length);
		Circum=t1.getCircum(width, length);
		Volume=t1.getVolume(width, length, height);
		
		System.out.println("����: "+Area+" �ѷ�: "+Circum+" ����: "+Volume);
		
	}
}
