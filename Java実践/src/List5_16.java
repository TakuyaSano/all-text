
enum KeyType {
	PADLOCK,
	BUTTON,
	DIAL,
	FINGER,
	;
}

class StrongBox2<E> {

	private E element;
	private KeyType keyType;
	private long count;

	public StrongBox2(KeyType keyType) {
		this.keyType = keyType;
	}

	// インスタンスの保持
	public void put(E element) {
		this.element = element;
	}

	// インスタンスの取得
	public E get() {
		count++;
		switch (keyType) {
		case PADLOCK:
			if (count < 1024) {
				return null;
			}
			break;
		case BUTTON:
			if (count < 10000) {
				return null;
			}
			break;
		case DIAL:
			if (count < 30000) {
				return null;
			}
			break;
		case FINGER:
			if (count < 1000000) {
				return null;
			}
			break;
		default:
			break;
		}
		return this.element;
	}

	public KeyType getKeyType() {
		return keyType;
	}
}

public class List5_16 {
	public static void main(String[] args) throws InterruptedException {

		// 南京錠
		StrongBox2<String> sb1 = new StrongBox2<>(PADLOCK);
		sb1.put("南京錠");
		check(sb1, 1024);

		// 押ボタン
		StrongBox2<String> sb2 = new StrongBox2<>(BUTTON);
		sb2.put("押ボタン");
		check(sb2, 10000);

		// ダイヤル
		StrongBox2<String> sb3 = new StrongBox2<>(DIAL);
		sb3.put("ダイヤル");
		check(sb3, 30000);

		// 指紋認証
		StrongBox2<String> sb4 = new StrongBox2<>(FINGER);
		sb4.put("指紋認証");
		check(sb4, 1000000);
	}

	private static void check(StrongBox2<String> sb, long limit) {
		System.out.println(sb.getKeyType() + "の必用施行回数＝" + limit);
		for (long i = 1; i <= limit; i++) {
			String str = sb.get();
			if (i == limit - 1) {
				System.out.println((limit - 1) + " : " + str);
			}
			if (i == limit) {
				System.out.println(limit + " : " + str);
			}
		}
	}
}
