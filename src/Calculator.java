import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {
	static Supplier<Calculator> instance = Calculator::new;
	// Это ссылка на вызов конструктора

	// Математические операции над двумя числами
	BinaryOperator<Integer> plus = (x, y) -> x + y;
	BinaryOperator<Integer> minus = (x, y) -> x - y;
	BinaryOperator<Integer> multiplay = (x, y) -> x * y;
	BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;

	// Математические операции над одним числом
	UnaryOperator<Integer> pow = x -> x * x;
	UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

	// Использование интерфейса Predicate
	// положительно ли число и проверка чётности
	Predicate<Integer> isPositive = x -> x > 0;
	Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

	Consumer<Integer> println = System.out::println;
	// Можно записать вместо p -> System.out.println(p)
}