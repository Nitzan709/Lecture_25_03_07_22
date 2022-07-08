public class Person {
    private String name;

    public Person() {    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='%s'}".formatted(name);
    }
}
