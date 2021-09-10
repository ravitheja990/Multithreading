package Streams.Terminal;

import java.util.*;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 4, 2));
        System.out.println(list.stream().filter(x->x%2!=0).reduce(0,(a, b)->a+b));
    }
}
