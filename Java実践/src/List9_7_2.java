import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class List9_7_2 {
	public static void main(String[] args) throws IOException {

		// 起動パラメータの取得
		String orgPath = args[0];
		String prePath = args[1];
		System.out.println(orgPath + "\r\nを\r\n" + prePath + "\r\nにコピーします。");

		// ファイルインスタンスの生成
		System.out.println("ファイルインスタンスの生成");
		File orgFile = new File(orgPath);
		File preFile = new File(prePath);

		// コピー元ファイルを読む
		FileInputStream fis	= new FileInputStream(orgFile);
		StringBuilder sb = new StringBuilder();
		System.out.println("コピー元ファイルを読む");
		int i = fis.read();
		while (i != -1) {
			char c = (char) i;
			sb.append(c);
			i = fis.read();
		}
		fis.close();

		FileOutputStream fos	= new FileOutputStream(preFile);
		for (int j = 0; j < sb.length(); j++) {
			// コピー先ファイルに書く
			fos.write(sb.charAt(j));
		}
		fos.flush();
		fos.close();
	}
}

