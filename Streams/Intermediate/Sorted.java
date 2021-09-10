package Streams.Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 4, 2));
        System.out.println(list.stream().sorted((a,b)->b-a).collect(Collectors.toList()));
    }
}
