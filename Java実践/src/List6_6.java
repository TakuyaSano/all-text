// 練習6-1
public class List6_6 {

	// メインメソッド
	public static void main(String[] args) {
		// 関数１の呼び出し
		Func1 func1 = FuncList::isOdd;
		boolean bool = func1.call(5);
		System.out.println(bool ? "奇数" : "偶数");

		// 関数２の呼び出し
		FuncList funcList = new FuncList();
		Func2 func2 = funcList::addNamePrefix;
		String str = func2.call(true, "遠藤");
		System.out.println(str);
		String str2 = func2.call(false, "田中");
		System.out.println(str2);
	}
}