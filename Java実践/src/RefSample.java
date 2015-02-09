public class RefSample {
	public int pub = 0;
	public RefSample(int t){
		this.pub = t;
	}
	public void hello(String msg){
		this.hello(msg, this.pub);
	}
	public void hello(String msg, int t){
		System.out.println("Hello,"+msg+"x"+t);
	}
}