import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class List12_2 {
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
			// STEP 2-①-1 送信すべきSQL文のひな形を準備
			System.out.println("STEP 2-①-1 送信すべきSQL文のひな形を準備");
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME=?");

			// STEP 2-①-2 ひな形に値を流し込みSQL文を組み立て送信する
			System.out.println("STEP 2-①-2 ひな形に値を流し込みSQL文を組み立て送信する");
			pstmt.setInt(1, 10);				// 1番目の?に10を流し込み
			pstmt.setString(2, "ゾンビ");	// 2番目の?に"ゾンビを流し込み"
			int r = pstmt.executeUpdate();

			// STEP 2-①-3 処理結果を判定する
			System.out.println("STEP 2-①-3 処理結果を判定する");
			if (r != 0) {
				System.out.println(r + "件のモンスターを削除しました。");
			} else {
				System.out.println("該当するモンスターはいませんでした");
			}
			pstmt.close();//後片付け
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
