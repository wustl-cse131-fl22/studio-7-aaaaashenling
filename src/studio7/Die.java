package studio7;

public class Die {
	private int sideNum;
	
	public Die(int n) {
		sideNum = n;
	}
	
	public int side() {
		return (int) Math.random() * sideNum;
	}
}
