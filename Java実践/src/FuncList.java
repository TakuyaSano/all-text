class FuncList {

	// 関数１
	public static boolean isOdd(int x) {
		return (x % 2 == 1);
	}

	// 関数２
	public String addNamePrefix(boolean male, String name) {
		if (male) {
			return "Mr." + name;
		} else {
			return "Ms." + name;
		}
	}
}