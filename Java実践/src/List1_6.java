public class List1_6 {
	public static void main(String[] args) {
		List1_6 list = new List1_6();
		System.out.println(list.isValidPlayerName("MINATO01"));
	}

	boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}