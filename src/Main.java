import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);  // Получится 0
        int c = calc.divide.apply(a, b);
        System.out.println(c);
        //int c  = calc.divide.apply(a,b);  // На ноль делить нельзя
        //  Можно добавить проверку
         // Optional<Integer> result = b != 0 ? Optional.of(calc.divide.apply(a, b)) : Optional.empty();
       // result.ifPresentOrElse(calc.println, () -> System.out.println("0"));
        // calc.println.accept(c);
    }
}