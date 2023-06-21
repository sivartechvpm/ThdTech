package learn.java.practice;

public class StringReverse {

	public static void main(String[] args) {
		String s = "siva";
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result = result + s.charAt(i);
		}
		System.out.println(result);
	}

}
