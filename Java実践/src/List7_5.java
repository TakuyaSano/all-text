import java.io.IOException;

public class List7_5 {
	public static void main(String[] args)throws IOException{

		//Stringに関する情報を取得して表示する
		Class<?> info1 = String.class;
		System.out.println("クラス名:"+ info1.getSimpleName());	//⇒String
		System.out.println("FQCN:"+ info1.getName());	//⇒java.lang.String
		System.out.println("パッケージ"+ info1.getPackage().getName());
		System.out.println("配列クラスか:"+ info1.isArray());

		//Stringの親クラスの情報を取得する
		Class<?>info2 = info1.getSuperclass();
		System.out.println(info2.getName());	//⇒java.lang.Object
		//なお、argsはきちんとした文字列配列として判定される
		Class<?>info3 = args.getClass();
		System.out.println(info3.isArray());	//⇒true
	}
}