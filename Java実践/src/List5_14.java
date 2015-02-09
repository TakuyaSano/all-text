class List5_14<E> {

	// 1つのインスタンスを格納
	private E element;

	// インスタンスの保持
	public void put(E element) {
		this.element = element;
	}

	// インスタンスの取得
	public E get() {
		return this.element;
	}
}

public class List5_14 {
	public static void main(String[] args) throws InterruptedException {

		// 文字列を格納
		StrongBox<String> sbs = new StrongBox<>();
		sbs.put("文字列");
		System.out.println(sbs.get());

		// 数値を格納
		StrongBox<Integer> sbi = new StrongBox<>();
		sbi.put(123);
		System.out.println(sbi.get());
	}
}