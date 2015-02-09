import java.sql.Connection;		// java.sqlをインポートしておく
import java.sql.DriverManager;
import java.sql.SQLException;

public class List12_6 {
	public static void main(String[] args) {

		System.out.println("STEP 0: 事前準備（JAR配置を含む）");
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			System.out.println("STEP 1: データベースの接続");
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");	// JDBCURLを指定
			con.setAutoCommit(false);		// 手動コミットモードに切り替え

			System.out.println("STEP 2: SQL送信処理");
			/* *****メインのDB処理（SQL送信）***** */
			con.commit();		// コミット
		} catch (SQLException e) {
			try {
				con.rollback();			// ロールバック
			} catch (SQLException e2) {
				e2.printStackTrace();
			} finally {
				System.out.println("STEP 3: データベース接続の切断");
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e3) {
						e3.printStackTrace();
					}
				}
			}
		}
	}
}
