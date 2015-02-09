package jp.miyabilink;

@SuppressWarnings("serial")
public class List13_3 extends List13_2 {
	
	@Override
	public int transfer(Bank bank,List13_2 dest,int ammount){
		return ammount;
	}

	@Deprecated
	public void transfer(List13_2 dest, int ammount){
	}
}