
public class Calculator {

	int a, b, c, e;
	float d;

	int num1, num2;

	public void Calculator(int Num1, int Num2) {

		num1 = Num1;
		num2 = Num2;

	}

	public int sum() {

		a = num1 + num2;

		return a;

	}

	public int sub() {

		b = num1 - num2;
		return b;

	}

	public int mul() {

		c = num1 * num2;
		return c;
	}

	public float div() {

		d = num1 / num2;
		return d;

	}

	public int mod() {

		e = num1 % num2;
		return e;

	}

}
