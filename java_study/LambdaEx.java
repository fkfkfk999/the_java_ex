package java_study;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaEx {
    public static void main(String[] args) {
        //Function 하나의 매개변수를 받아 하나를 리턴해준다.
        Function<Integer, String> printCnt = i -> i + "개 입니다.";
        System.out.println(printCnt.apply(33));
        Function<Integer, Integer> squareObj = i -> i*i;
        System.out.println("7의 제곱 => " + squareObj.apply(7));

        //Supplier 매개변수 없이 하나의 값을 리턴
        Supplier<String> basic = () -> "Hello World";
        System.out.println(basic.get());

        //Consumer 매개변수만 있고 리턴값이 없다.
        Consumer<Integer> printSquare = i -> System.out.println(i + "의 제곱 => " + i*i);
        printSquare.accept(8);

        Predicate<Integer> checkEven = i -> i%2 == 0;
        if(checkEven.test(8)) System.out.println("짝수");
        else System.out.println("홀수");

        UnaryOperator<Integer> squareObj2 = i -> i*i;
        System.out.println("8의 제곱 => " + squareObj2.apply(3));
    }
}
