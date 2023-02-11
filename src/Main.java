import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//        Напишите реализации функционального интерфейса Predicate
//        которые проверяют, является ли число положительным
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer < 0) {
                    return false;
                }
                return true;
            }
        };
        Predicate<Integer> predicate2 = x -> x > 0;

        System.out.println(predicate1.test(2));
        System.out.println(predicate2.test(-2));

//        Создайте функциональный интерфейс Consumer
// который принимает на вход имя человека и выводит в консоль приветствие в его адрес

        Consumer<String> consumer1  = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello, " + s + "!");
            }
        };
        Consumer<String> consumer2 = s -> System.out.println("Hello, " + s + "!");

        consumer1.accept("Ivan");
        consumer2.accept("Dmitry");

//        Реализуйте функциональный интерфейс Function
// который принимает на вход вещественное число типа Double
// а возвращает его округленный вариант типа Long

        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        Function<Double, Long> function2 = x -> Math.round(x);
        Function<Double, Long> function3 = Math::round;

        System.out.println(function1.apply(3.462));
        System.out.println(function2.apply(5.231));

//        Напишите Supplier
//   который возвращает случайное число из диапазона от 0 до 100

        Supplier<Double> supplier1 = new Supplier<Double>() {

            @Override
            public Double get() {
                double x = Math.random() * 100;
                return Math.random() * 100;

            }
        };
        Supplier<Double> supplier2 = () -> (double) (Math.random() * 100);

        System.out.println(supplier1.get());
        System.out.println(supplier2.get());

    }

}
