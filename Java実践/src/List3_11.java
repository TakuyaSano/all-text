import java.util.HashMap;
import java.util.Map;

public class List3_11 {
	public static void main(String[] args) {

		// インスタンスの生成
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");

		// Mapに格納
		Map<String, Integer> map = new HashMap<>();
		map.put(h1.getName(), 3);
		map.put(h2.getName(), 7);

		// 出力
		for (String key : map.keySet()) {
			System.out.println(key + "が倒した敵＝" + map.get(key));
		}
	}
}