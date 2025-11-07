package pack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        //Accept paramater --> process it --> and return result
        Function<String, String> f =(a) -> a.toUpperCase();
        System.out.println(f.apply("shrini"));

        //accept one paramater ---> return true false
        Predicate<Integer> p=(a) -> a%2==0;
        System.out.println(p.test(11));

        // Accept input and doesent return
        Consumer<Integer> c=(a) -> System.out.println(a);
        c.accept(10);

        //Supplier<> s=() -> System.out.println("Dataabse operation");



        List<Integer> l= Arrays.asList(1,2,7,9,5);
        //filter
        System.out.println(l.stream().filter( n -> n%2 !=0).collect(Collectors.toList()));





    }
}













//Method Reference - use method without invoking and ...
// in place of lambda expression

//List<String> a= Arrays.asList("A","B","C");
//
//        a.forEach(x-> System.out.println(x.toLowerCase()));
//        a.forEach(System.out::println);