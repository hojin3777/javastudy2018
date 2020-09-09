package main;
import java.util.*;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		scores.put(90, "김재영");
		scores.put(65, "이호선"); //Integer 상수로 값을 입력하는 경우
		scores.put(new Integer(85), "김종수"); //실제 객체의 값으로 입력하는 경우
		scores.put(new Integer(97), "이경은");
		scores.put(new Integer(75), "김성렬");
		scores.put(new Integer(80), "김혁준");
		
		Map.Entry<Integer, String> entry = null; //매번 새로운 값을 넣기 위하여 저장하는 값.
		
		entry = scores.firstEntry(); //키값이 가장 낮은 경우
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry(); //키값이 가장 높은 경우
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(95); //주어진 키보다 바로 아래의 entry (미만)
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(95)); //주어진 키보다 바로 위의 entry (초과)
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.floorEntry(new Integer(95)); //주어진 키값이 있다면 해당 entry 없다면 바로 아래(이하)
		System.out.println(entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(84)); //주어진 키값이 있다면 해당 entry 없다면 바로 위(이상)
		System.out.println(entry.getKey() + "-" + entry.getValue());
	}
}
