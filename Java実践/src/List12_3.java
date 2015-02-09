import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class List12_3 {
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
			// STEP 2-②-1 送信すべきSQL文のひな形を準備
			System.out.println("STEP 2-②-1 送信すべきSQL文のひな形を準備");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM MONSTERS WHERE HP >= ?");

			// STEP 2-②-2 ひな形に値を流し込みSQL文を組み立て送信する
			System.out.println("STEP 2-②-2 ひな形に値を流し込みSQL文を組み立て送信する");
			pstmt.setInt(1, 10);				// 1番目の?に10を流し込み
			ResultSet rs = pstmt.executeQuery();
			/* ******************************
			　　結果表の処理（記述する内容は、後述します）
			 ******************************  */
			rs.close();
			pstmt.close();	//後片付け
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
