package optExp;

public class PostfixTest {

	public static void main(String[] args) {
		OptExp opt = new OptExp();
		int result;
		String exp = "35*62/-";
		System.out.printf("\n����ǥ��� : %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n������ = %d\n", result);
	}
}