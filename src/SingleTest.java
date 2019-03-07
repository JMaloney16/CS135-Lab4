public class SingleTest {
	
	private int a,b,c;
	private String output;
	
	public SingleTest(int x, int y, int z, String output) {
	   a = x;
	   b = y;
	   c = z;
	   this.output = output;
	}
	
	public int FirstInput () {
		return a;
	}
	
	public int SecondInput () {
		return b;
	}
	
	public int ThirdInput () {
		return c;
	}
	
	public String Output(){
		return output;
	}

}

