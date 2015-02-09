public class List1_10 {
	public static void main(String[] args) {

		// 1から100までの整数をカンマで連結した文字列を生成
		StringBuilder sb = new StringBuilder();
		for (int i = 1;i <= 100;i++) {
			sb.append(i).append(",");
		}
		String s = sb.toString();

		System.out.println(s);			// 確認用出力

		// カンマで分割
		String[] a = s.split(",");

		for (String str : a) {
			System.out.println(str);	// 確認用出力
		}
	}
}