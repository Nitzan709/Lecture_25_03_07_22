import java.time.LocalDateTime;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierExample {

    public static final int ID_LENGTH = 5;

    public static void main(String[] args) {
        Supplier<UUID> anonSupplier = UUID::randomUUID;

        UUID uuid = anonSupplier.get();
        System.out.println(uuid.toString().substring(0, ID_LENGTH));

        LocalDateTime now = LocalDateTime.now();

        doSomethingWithLocalDateTime(LocalDateTime::now);
    }

    private static void doSomethingWithLocalDateTime(Supplier<LocalDateTime> supplier) {
        LocalDateTime time = supplier.get();
        System.out.println(time);
    }
}
