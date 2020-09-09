package main;

public class wrapper {
	public static void main(String[] args) {
		
		String a = "10";
		String b = "20";
		
		int result;
		double result2;
		
		result = Integer.parseInt(a)+Integer.parseInt(b);
		result2 = Double.valueOf(a).doubleValue() + Double.valueOf(b).doubleValue();
		
		System.out.println(result);
		System.out.println(result2);
	}

}
