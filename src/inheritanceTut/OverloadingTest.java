package inheritanceTut;

class OverloadingTest {
	
	public int multiply(int x, int y) {
		return (x * y);
	}
	
	public int multiply(int x, int y, int z) {
		return (x * y * z);
	}

	public double multiply(double x, double y) {
		return (x * y);
	}
	
	public double multiply(double x, double y, double z) {
		return (x * y * z);
	}
	
	
	public static void main(String args[]) {
		OverloadingTest demo = new OverloadingTest();
		System.out.println(demo.multiply(10, 20));
		System.out.println(demo.multiply(10, 10.5));
		System.out.println(demo.multiply(10,20,30));
	}

}
