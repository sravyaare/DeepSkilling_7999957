import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortDemo {

    public static void main(String[] args) {

        List<String> courseNames = new ArrayList<>();

        courseNames.add("Java");
        courseNames.add("Python");
        courseNames.add("React");
        courseNames.add("Spring Boot");
        courseNames.add("Angular");

        Collections.sort(courseNames, (first, second) -> first.compareTo(second));

        System.out.println("Sorted List:");

        for (String course : courseNames) {
            System.out.println(course);
        }
    }
}