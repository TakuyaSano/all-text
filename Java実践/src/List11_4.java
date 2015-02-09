import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class List11_4 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://dokojava.jp/favicon.ico");
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("dj.ico");

		int i = is.read();
		while (i != -1) {
			fos.write(i);

			System.out.print((char) i);
			i = is.read();
		}
		is.close();
	}
}