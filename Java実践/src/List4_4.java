import java.util.HashSet;
import java.util.Set;

class Hero4_4{
	public String name;
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof Hero4_4)) {
			return false;
		}
		Hero4_4 h = (Hero4_4) o;
		if (!this.name.trim().equals(h.name.trim())) {
			return false;
		}
		return true;
	}
}

public class List4_4 {
	public static void main(String[] args) {

		Set<Hero4_4> set = new HashSet<>();

		Hero4_4 h1 = new Hero4_4();
		h1.name = "ミナト";
		set.add(h1);
		System.out.println("要素数＝" + set.size());

		h1 = new Hero4_4();
		h1.name = "ミナト";
		set.remove(h1);
		System.out.println("要素数＝" + set.size());
	}
}