import java.io.FileWriter;
import java.io.IOException;

public class List9_4 {
	public static void main(String[] args){
		FileWriter fw = null;
		try{
			fw = new FileWriter("rpgsave.dat", true);
			fw.write('A');
			fw.flush();
		}catch(IOException e){
			System.out.println("ファイル書き込みエラーです");
		}finally{
			if(fw != null){
				try{
					if(fw != null){
						fw.close();
					}
				}catch(IOException e2){
				}
			}
		}
	}
}