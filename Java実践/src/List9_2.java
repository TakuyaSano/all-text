import java.io.FileReader;
import java.io.IOException;

public class List9_2 {
	public static void main(String[] args) throws IOException{
		FileReader fw = new FileReader("rpgsave.dat");	//STEP1
		System.out.println("すべてのデータを読んで表示します");
		int i = fw.read();		//STEP2
		while(i != -1){
			char c = (char)i;
			System.out.print(c);
			i = fw.read();
		}
		System.out.println("ファイルの末尾に到達しました");
		fw.close();		//STEP3
	}
}