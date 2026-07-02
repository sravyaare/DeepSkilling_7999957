import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Sravya", 20);
        Person person2 = new Person("Anjali", 17);
        Person person3 = new Person("Rahul", 22);

        System.out.println("Individual Records:");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        List<Person> people = Arrays.asList(
                person1,
                person2,
                person3
        );

        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\nPeople aged 18 and above:");
        adults.forEach(System.out::println);
    }
}