public class List1_8 {
	public static void main(String[] args) {


		Hero hero = new Hero("ヒーロー", "剣士", 100000);

		final String FORMAT = "%8s  %6s  所持金%,5d";
		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.print(s);
		System.out.println();
		System.out.printf("%8s  %6s  所持金%,5d", "ヒーロー", "剣士", 100000);
	}
}