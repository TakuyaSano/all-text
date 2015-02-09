import java.util.ArrayList;
import java.util.List;

class Hero3_9 {
	public String name;
}

public class List3_9 {
	public static void main(String[] args) {
		Hero3_9 h = new Hero3_9();
		h.name = "ミナト";
		List<Hero3_9> list = new ArrayList<Hero3_9>();
		list.add(h);
		h.name = "スガワラ";
		System.out.println(list.get(0).name);
	}
}