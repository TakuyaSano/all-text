import java.util.function.IntToDoubleFunction;
public class List6_5{

	public static void main(String[] args){
		double b =1.41;
		IntToDoubleFunction func = (x) ->{
			return x * x * b;
		};
		double a = func.applyAsDouble(2);
		System.out.println("2 * 2 * 1.41="+ a);
	}
}