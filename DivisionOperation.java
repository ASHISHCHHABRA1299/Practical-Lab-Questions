package exception;

public class DivisionOperation {
	public static void main(String[] args) {
		try {
			division(2, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}

	public static void division(int n1, int n2) {
		if (n2 == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}

		int k = n1 / n2;
		System.out.println("Answer: " + k);

	}
}
