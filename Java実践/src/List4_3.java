import java.util.ArrayList;
import java.util.List;

class Hero4_3{
	public String name;
}

public class List4_3 {
	public static void main(String[] args) {

		List<Hero4_3> list = new ArrayList<>();

		Hero4_3 h1 = new Hero4_3();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数＝" + list.size());

		h1 = new Hero4_3();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数＝" + list.size());
	}
}