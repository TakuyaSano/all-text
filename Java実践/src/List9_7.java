import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class List9_7 {
	public static void main(String[] args) throws IOException {

		// 起動パラメータの取得
		String orgPath = args[0];
		String prePath = args[1];
		System.out.println(orgPath + "\r\nを\r\n" + prePath + "\r\nにコピーします。");

		// ファイルインスタンスの生成
		System.out.println("ファイルインスタンスの生成");
		File orgFile = new File(orgPath);
		File preFile = new File(prePath);

		FileInputStream fis	= new FileInputStream(orgFile);
		FileOutputStream fos	= new FileOutputStream(preFile);


		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		// コピー元ファイルを読む
		System.out.println("コピー元ファイルを読む");
		int i = fis.read();
		while (i != -1) {
			sb1.append(i).append(", ");
			char c = (char) i;
			sb2.append(c).append(", ");
			// コピー先ファイルに書く
			fos.write(c);
			i = fis.read();
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
	}
}
