import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UsageExamples {
    public static void main(String[] args) {
        String[] words = {"dish", "clay", "invite", "drawer", "frame"};

        //option 1
        Arrays.sort(words, Comparator.naturalOrder());

        //option 2
        Arrays.sort(words, String::compareTo);
        System.out.println(Arrays.toString(words));

        //option 3 - comparing the length of the word
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));

        List<String> names = new ArrayList<>(Arrays.asList("Rany", "", "Gideon", "", "Nitzan", "Yonathan", "Noy", "May"));

        System.out.println(names);

        names.removeIf(String::isEmpty);

        System.out.println(names);

        //Declarative Programing
        names.removeIf(s -> s.length() <= 3);

        //Imperative Programing
        for (String name : names) {
            if (name.length() <= 3) {
                //remove
            }
        }

        System.out.println(names);

        names.forEach(System.out::println);

        List<String> codes = new ArrayList<>(Arrays.asList(" 1-2-3-4",
                "a-b-c-d",
                "x-y-z"));

        codes.replaceAll(String::trim);
        codes.replaceAll(String::toUpperCase);

        codes.forEach(System.out::println);
    }
}
