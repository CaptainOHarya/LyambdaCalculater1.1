public class Main {

	public static void main(String[] args) {
		Calculator calc = Calculator.instance.get();

// Математические операции
		System.out.println();
		int a = calc.plus.apply(2, 2);
		int b = calc.minus.apply(1, 1);
		int c = calc.devide.apply(a, b);// Если b будет 0, то возникает ошибка деления на ноль
		if (b == 0)
			System.err.println("Обнаружено деление на ноль, операция деление не выполнена");

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
