package pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

        System.out.println(numbers.stream().filter(x -> x%2==0).count());

        //Infinite Stream
        // it will generate infinite stream we should provide limit()
        Stream.generate(() -> 1);
        Stream.iterate(1, x-> x+1);

        // find string which length > 3
        List<String> list = Arrays.asList("Anna", "Bob", "Charlie", "David");

        List<String> collect = list.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
        System.out.println(collect);

        // first square and then sort
        List<Integer> nums = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(nums.stream().map(x -> x*x).sorted().collect(Collectors.toList()));;

        // sum of list
        System.out.println(numbers.stream().reduce((a,b) -> a+b).get());
        System.out.println(numbers.stream().reduce(Integer::sum).get());

    }
}
