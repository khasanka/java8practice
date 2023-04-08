import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(5, 4, 7, 5, 2, 9, 3, 6, 9, 7, 1, 1, 2, 3, 7);

        Map<Integer, Long> collectionMap = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collectionMap.forEach((key,value) -> {
            System.out.print(key+"-"+value+", ");
        });

    }

}
