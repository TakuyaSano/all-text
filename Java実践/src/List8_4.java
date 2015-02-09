import org.apache.commons.lang3.builder.HashCodeBuilder;

public class List8_4 {
	String name;
	String address;

	public int hashCode(){
		return HashCodeBuilder.reflectionHashCode(this);
	}
}