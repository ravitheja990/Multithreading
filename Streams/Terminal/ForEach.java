package Streams.Terminal;

import java.util.*;

public class ForEach {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 4, 2));
        System.out.println(set);
        set.stream().map(x->x*x).forEach(a-> System.out.println(a));
    }
}
