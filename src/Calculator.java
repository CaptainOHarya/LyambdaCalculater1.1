import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {
	static Supplier<Calculator> instance = Calculator::new;

	// �������������� �������� ��� ����� �������
	BinaryOperator<Integer> plus = (x, y) -> x + y;
	BinaryOperator<Integer> minus = (x, y) -> x - y;
	BinaryOperator<Integer> multiplay = (x, y) -> x * y;
	BinaryOperator<Integer> devide = (x, y) -> x / y;

	// �������������� �������� ��� ����� ������
	UnaryOperator<Integer> pow = x -> x * x;
	UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

	// ������������� ���������� Predicate
	// ������������ �� ����� � �������� ��������
	Predicate<Integer> isPositive = x -> x > 0;
	Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

	Consumer<Integer> println = System.out::println;
}