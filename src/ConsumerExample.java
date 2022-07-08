import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> anonConsumer = System.out::println;

        anonConsumer.accept("Srulik");
    }
}
