import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.util.stream.IntStream.rangeClosed;

public class FilterEventNumber {

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            input.add(i);
        }

        for (Integer number: input) {
            if(number%2 ==0) {
                out.println(number);
            }
        }

        rangeClosed(1, 10).boxed().collect(Collectors.toList())
                .stream()
                .filter(number -> number%2==0)
                .forEach(out::println);

    }

}
