package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aggregation {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 3, 4);

        // ------------ Concat two lists

        Stream<Integer> integerStream = Stream.concat(list1.stream(), list2.stream());
        List<Integer> concatList = integerStream.collect(Collectors.toList());
        System.out.println(concatList);

        // ------------ remove duplicates

        List<Integer> noDuplicateList = concatList.stream().distinct().collect(Collectors.toList());
        System.out.println(noDuplicateList);

        // ------------ max num
        Optional<Integer> max = concatList.stream().max((a, b) -> a - b);
        System.out.println(max.get());
    }
}
