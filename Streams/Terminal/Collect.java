package Streams.Terminal;

import java.util.*;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 4, 2));
        System.out.println(set.stream().map(x->x*x).collect(Collectors.toSet()));
    }
}
