
public class ControlClass {
	private InputClass inputclass;
	private Calculator calculator;
	private OutputClass outputClass;
	private int a, b;
	int aa, bb, cc, ee;
	float dd;
	
	public ControlClass() {
		// TODO Auto-generated constructor stub
		inputclass = new InputClass();
		calculator = new Calculator();
		outputClass = new OutputClass();
	}

	public void Control() {

		inputclass.Inputclass();

		a = inputclass.getNumA();
		b = inputclass.getNumB();


		calculator.Calculator(a, b);

		aa = calculator.sum();
		bb = calculator.sub();
		cc = calculator.mul();
		dd = calculator.div();
		ee = calculator.mod();

		outputClass.Outputclass(aa, bb, cc, dd, ee);

	}

}
