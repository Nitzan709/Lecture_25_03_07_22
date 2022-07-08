import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        Function<String, Person> personFunction = Person::new;

        Person person1 = personSupplier.get();
        Person person2 = personFunction.apply("Srulik");

        System.out.println(person1);
        System.out.println(person2);
    }
}
