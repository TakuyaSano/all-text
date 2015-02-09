public class List14_6 {
	private String name;	//銀行名
	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		if(newName.length() < 3){
			throw new IllegalArgumentException("名前が不正です");
		}
		this.name = newName;
	}
}