package LabINF72Function;

import java.util.*;
import java.util.function.Function;

public class Main {

    public static int factorial(int n) {
        if(n==0) return 1;
        System.out.println("n = " + n);
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Function<Integer,Integer> add = x->x+5;
        System.out.println(add.apply(5));

        Function<Integer,Integer> multiply = x->x*3;
        System.out.println(multiply.apply(4));

        Function<Integer,Integer> addThenMultiply = add.andThen(multiply);
        System.out.println(addThenMultiply.apply(2));
        // ((2+5) * 3)

        System.out.println(factorial(5));

        System.out.println("\n");

        List numbers = Arrays.asList(1,2,3,4,5);
        Function<Integer,Integer> square = x->x*x;
        numbers.stream().map(square).forEach(System.out::println);




    }
}
