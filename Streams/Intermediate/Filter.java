package Streams.Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        System.out.println(list.stream().filter(a->a%2!=0).collect(Collectors.toList()));
    }
}
