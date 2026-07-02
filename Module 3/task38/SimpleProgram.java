public class SimpleProgram {

    public String greet(String name) {

        return "Hello, " + name;
    }

    public static void main(String[] args) {

        SimpleProgram obj = new SimpleProgram();

        System.out.println(
                obj.greet("Sravya")
        );
    }
}