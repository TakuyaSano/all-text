import java.util.HashMap;
import java.util.Map;

public class List3_7 {
	public static void main(String[] args){

		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);			//ペアで値を格納
		prefs.put("東京都", 1261);			//ペアで値を格納
		prefs.put("京都府", 181);			//ペアで値を格納
		int tokyo = prefs.get("東京都");	//キーを指定して値を取得する

		System.out.println("東京都の人口は、" + tokyo);

		prefs.remove("京都府");
		prefs.put("熊本県", 182);			//値が上書きされた
		int kumamoto = prefs.get("熊本県");

		System.out.println("熊本県の人口は、" + kumamoto);
	}
}