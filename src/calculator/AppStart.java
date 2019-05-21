package calculator;

public class AppStart {

	public Calculator cal;
	
	public AppStart() {
		cal = new Calculator(this);
		
	}
	
	public static void main(String[] args) {
		AppStart as = new AppStart();
	}
}
