class Hero {

}

public class List5_1 {

	// printsメソッド
	// 第1引数の文字列を第2引数の回数だけ表示します
	// 第1引数には文字列情報を、第2引数には整数を指定してください
	public static void prints(Object a, Object b) {
		for (int i = 0; i < (Integer) b; i++) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Object s = "こんにちは";
		s = new Hero();
		Object n = 1;
//		prints(s, n);
		prints(n, s);
	}
}