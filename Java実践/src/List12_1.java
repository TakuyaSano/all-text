import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class List12_1 {
	public static void main(String[] args) {

		// STEP 0: 事前準備（JAR配置を含む）
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			// STEP 1: データベースの接続
			System.out.println("STEP 1: データベースの接続");
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");

			// STEP 2: SQL送信処理
			System.out.println("STEP 2: SQL送信処理");
			/* ****************************
			 メインのDB操作処理　　（後術します）
			**************************** */
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// STEP 3: データベース接続の切断
			System.out.println("STEP 3: データベース接続の切断");
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
