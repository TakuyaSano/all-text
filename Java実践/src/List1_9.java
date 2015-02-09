public class List1_9 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.print(w);
	}
}