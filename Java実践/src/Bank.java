
public class Bank {
	String name;
	String address;

	public boolean equals(Object o){
		return EqualsBuilder.reflectionEquals(this, o);
	}
}