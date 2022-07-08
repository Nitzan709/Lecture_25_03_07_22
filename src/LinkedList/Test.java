package LinkedList;

import java.util.Arrays;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.appendAll(Arrays.asList("a", "b", "c", "d"));

        list.forEach(System.out::println);

        list.replaceAll(s -> "*");

        list.forEach(System.out::println);

    }
}
