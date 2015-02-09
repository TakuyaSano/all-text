package Free;

public class Test_10 {
	public static void main(String[] args){
		System.out.println();

		int kuku[][] = new int[9][9];

		for( int i= 0; i<9; i++ ) {
			for( int k= 0; k<9; k++ ){
				kuku[i][k] = (i+1) * (k+1);
			}
		}
		for( int i= 0; i<9; i++ ) {
			for( int k= 0 ; k<9; k++ ) {
				System.out.print(kuku ik + " ");
			}
			System.out.println();
		}
	}
}