package Chapter2;

public class Controler {
	private Input in;
	private Output out;
	private Calculator cal;

	public Controler() {
		in = new Input();
		out = new Output();
		cal = new Calculator();
	}

	public void control() {
		in.inputData();

		cal.setData(in.getNum1(), in.getNum2());
		cal.compute();

		out.setData(cal.getSum(), cal.getSub(), cal.getMul(), cal.getDiv(), cal.getRem());
		out.outputData();
	}

	public static void main(String[] args) {
		Controler c = new Controler();
		c.control();
	}
}
