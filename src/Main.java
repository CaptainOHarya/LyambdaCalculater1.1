
public class Main {

	public static void main(String[] args) {
		Calculator calc = Calculator.instance.get();

// �������������� ��������
		int a = calc.plus.apply(2, 2);
		int b = calc.minus.apply(2, 1);
		int c = calc.devide.apply(a, b);// ���� b ����� 0, �� ��������� ������ ������� �� ����

		int d = calc.pow.apply(a);
		int e = -d;
		int f = calc.abs.apply(e);

		calc.println.accept(a);
		calc.println.accept(b);
		calc.println.accept(c);
		calc.println.accept(d);
		calc.println.accept(e);
		calc.println.accept(f);
		System.out.println(calc.isPositive.test(f));
		System.out.println(calc.isPositive.test(e));
		System.out.println(calc.isEvenNumber.test(f));
		System.out.println(calc.isEvenNumber.test(b));

	}

}
