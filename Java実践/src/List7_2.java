public class List7_2 {
public static void main(String[] args) throws Exception{
	System.out.println("計算を開始します");
		//この間に計算処理を行う
	System.out.println("計算完了。結果を見てメモ帳で表示します。");
	ProcessBuilder pb = new ProcessBuilder(
			"c:\\windows\\system32\\notepad.exe"
	);
	pb.start();
	}
}