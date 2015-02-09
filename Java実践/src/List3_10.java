import java.util.ArrayList;
import java.util.List;

public class List3_10{
	public static void main(String[] args) {

		// インスタンスの生成
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");

		// リストに格納
		List<Hero> list = new ArrayList<>();
		list.add(h1);
		list.add(h2);

		// 出力
		for (Hero h : list) {
			System.out.println(h.getName());
		}
	}
}