import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class List1_11 {
	public static void main(String[] args) throws IOException {

		// 入力値を受け取る
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String folder	= br.readLine();
		String file		= br.readLine();

		System.out.println("folder=" + folder + ", file=" + file);
		String path = concatPath(folder, file);
		System.out.println(path);
	}

	private static String concatPath(String folder, String file) {
		StringBuilder sb = new StringBuilder();
		sb.append(folder);
		if (!folder.endsWith("\\")) {
			sb.append("\\");
		}
		sb.append(file);
		return sb.toString();
	}
}