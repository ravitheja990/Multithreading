package Streams.Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        System.out.println(list.stream().map(a->a*a).collect(Collectors.toList()));
    }
}
