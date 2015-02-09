import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

public class List10_5 {
	public static void main(String[] args) throws Exception{
		Writer fw = new FileWriter("c:\\rpgsave.properties");
		Properties p = new Properties();
		p.setProperty("heroName", "アサカ");
		p.setProperty("heroHp", "62");
		p.setProperty("heroMp", "45");
		p.store(fw,  "勇者の情報");
		fw.close();
	}
}