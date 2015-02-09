import static org.junit.Assert.*;
import jp.miyabilink.Account;

import org.junit.Test;




public class AccountTest_14_3 {

	//実際にAccountをnewして使ってみるテスト
	@Test
	public void instantiate(){
		Account a = new Account("ミナト", 30000);

		assertEquals(30000, a.balance);
	}
	@Test
	private static void transfer(){
	//TODO 自動生成されたメソッド・スタブ	//
	}
}