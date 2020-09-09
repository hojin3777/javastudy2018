package main;
import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[ ] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//°´Ã¼ ÀúÀå
		map.put("ÇÏ³ª", 85);
		map.put("µÑ", 90);
		map.put("¼Â", 80);
		map.put("³Ý", 75);
		map.put("´Ù¼¸", 95);
		
		map.put("µÎ¹øÂ°", 100);
		
		System.out.println("ÃÑ °¹¼ö : " + map.size());
		
		//°´Ã¼ Ã£±â
		System.out.println("\t¼Â : " + map.get("¼Â"));
		System.out.println();
		
		//°´Ã¼ ÇÏ³ª¾¿ Ã³¸®
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//°´Ã¼ »èÁ¦
		map.remove("µÑ");
		System.out.println("ÃÑ °¹¼ö : " + map.size());
		
		//°´Ã¼ ÇÏ³ª¾¿ Ã³¸®
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		//°´Ã¼ ÀüÃ¼ »èÁ¦
		map.clear();
		System.out.println("ÃÑ °¹¼ö : " + map.size());
	}
}
