package deepcopy;
import java.util.Arrays;

class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	protected Object clone() throws CloneNotSupportedException{
		Member cloned = (Member)super.clone(); //얕은 복사를 하여 name, age를 복사한다.
		cloned.scores = Arrays.copyOf(this.scores , this.scores.length); //scores를 깊은 복제한다.
		cloned.car = new Car(this.car.model); //깊은 복제 된 Member 객체를 리턴
		
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}

class Car{
	public String model;
	
	public Car(String model) {
		this.model = model;
	}
}

public class deepcopy {
	public static void main(String[] args) {
		//원본 객체 생성
		Member original = new Member("이호선", 26, new int[] {90,90}, new Car("아반떼"));
		
		//복제 객체를 얻은 후에 참조 객체 값을 변경
		Member cloned = original.getMember();
		cloned.scores[0]=100;
		cloned.car.model = "아우디";
		
		System.out.println("복제 개체의 필드값");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : { ");
		for(int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))? " " : "," );
		}
		System.out.println("}");
		System.out.println("car : " + cloned.car.model);
		
		
		System.out.println();
		
		
		System.out.println("원본 개체의 필드값");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : { ");
		for(int i = 0; i < original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))? " " : "," );
		}
		System.out.println("}");
		System.out.println("car : " + original.car.model);
	}
}
