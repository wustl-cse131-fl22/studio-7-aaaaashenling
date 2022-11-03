package studio7;

public class Fraction {
	private int denom;
	private int num;
	
	public Fraction(int d, int n) {
		denom = d;
		num = n;
	}
	
	public Fraction multiplication(Fraction other) {
		int newDenom = this.denom * other.denom;
		int newNum = this.num * other.num;
		return new Fraction(newDenom, newNum);
	}
	
	public Fraction division(Fraction other) {
		int newDenom = this.denom * other.num;
		int newNum = this.num * other.denom;
		return new Fraction(newDenom, newNum);
	}
	
	public Fraction addition(Fraction other) {
		int newDenom = this.denom * other.denom;
		int newNum = (this.denom * other.num) + (this.num * other.denom);
		return new Fraction(newDenom, newNum);
	}
	
	public Fraction subtraction(Fraction other) {
		int newDenom = this.denom * other.denom;
		int newNum = (this.num * other.denom) - (this.denom * other.num);
		return new Fraction(newDenom, newNum);
	}
	
	public Fraction reciprocal(Fraction other) {
		int newDenom = this.num;
		int newNum = this.denom;
		return new Fraction(newDenom, newNum);
	}
	
	public Fraction simplify() {
		int gcf = gcf(this.denom, this.num);
		int newDenom = this.denom / gcf;
		int newNum = this.num / gcf;
		return new Fraction(newDenom, newNum);
	}
	
	//helper method: gcf
	public static int gcf(int a, int b) {
		int max = 0;
		int gcf = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		for (int i = 0; i < max; i++) {
			if (a%i == 0 && b%i == 0) {
				gcf = i;
			}
		}
		return gcf;
	}
}
