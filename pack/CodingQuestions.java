package pack;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingQuestions {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> even = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        List<Integer> odd = numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
//
//        System.out.println(even+"\n"+odd);

//        System.out.println("---------Q2-----------");
//        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//
//        System.out.println(numbers.stream().distinct().collect(Collectors.toList()));

//        System.out.println("---------Q3-----------");
//        String input = "programming";
//        Map<Character, Long> frequencyMap = input.chars()
//                .mapToObj(c -> (char) c)
//                .collect(
//                        Collectors.groupingBy(
//                                c -> c, Collectors.counting()
//                        )
//                );
//
//        System.out.println(frequencyMap);

        ///////demo

//        List<String> words = Arrays.asList("cat", "dog", "bird", "cat", "tiger");
//
//        System.out.println(words
//                .stream()
//                .collect(
//                        Collectors
//                                .groupingBy(
//                                        word -> word,Collectors
//                                                .counting() )));

        /////////////////////////////////////////////////44444444444444444444444444444

//        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
//
//        Map<String, Long> collect = items.stream().collect(
//                Collectors.groupingBy(s -> s, Collectors.counting())
//        );
//
//        System.out.println(collect);
//

        ////////55555555555555555555555555
//        List<Double> numbers = Arrays.asList(12.5, 3.2, 7.8, 10.1, 5.6);
//        List<Double> collect = numbers.stream()
//                .sorted(( a,  b) -> b.compareTo(a)).collect(Collectors.toList());
//        System.out.println(collect);
//        //hint .sorted(Comparator.reverseOrder())

///////////////////////66666666666666666666666666
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//
//        String collect = words.stream().collect(Collectors.joining(",","[","]"));
//
//        System.out.println(collect);

        /////////////////////////7777777777777777777

//        List<Integer> numbers = Arrays.asList(10, 3, 15, 8, 25, 7, 30);
//        System.out.println(numbers.stream().filter(x-> x%5==0).collect(Collectors.toList()));

        //////////////////////8888888888888888888888888
//        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3, 8);
//        Integer i = numbers.stream().max((a,b) -> b-a).get();
//        System.out.println(i);

        /////////////////////999999999999999999999999
//        int[] arr1 = {5, 2, 9};
//        int[] arr2 = {7, 1, 4};
//
//        int[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
//        System.out.println(Arrays.toString(array));

        //8.Suppose if you have a list of 10 employees how will you find the record of an employee who is having second highest salary.
        String s="Ejaz";
        String s2=s;
        String s3=new String("Ejaz");
        String s4=new String("Ejaz");
        String s5="Ejaz";
        s5="Eju";

        System.out.println(s==s3);
        System.out.println(s.equals(s3));
        System.out.println(s5);
















    }
}

