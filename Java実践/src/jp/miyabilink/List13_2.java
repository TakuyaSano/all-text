package jp.miyabilink;

/**
 * 口座クラス。
 * @author Owner
 * @deprecated 代わりにNewAccountクラスを利用してください。
 */
public class List13_2 implements java.io.Serializable{

	/**
	 * 他行への振込みを行うメソッド。
	 * @param bank 送金先銀行
	 * @param dest 送金先口座
	 * @param amount 送金する金額
	 * @return 送金手数料
	 * @exception java.lang.IllegalArgumentException 残高不足のとき
	 */
	public int transfer(Bank bank, List13_2 dest, int ammount){
		return ammount;
	}
}