import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo {

    public static void main(String[] args) {

        try {

            Class<?> cls = Class.forName("Employee");

            System.out.println("Class Name: "
                    + cls.getName());

            Method[] methods =
                    cls.getDeclaredMethods();

            System.out.println("\nMethods:");

            for (Method method : methods) {

                System.out.print(method.getName() + "(");

                Parameter[] params =
                        method.getParameters();

                for (int i = 0; i < params.length; i++) {

                    System.out.print(
                            params[i].getType().getSimpleName()
                    );

                    if (i < params.length - 1) {
                        System.out.print(", ");
                    }
                }

                System.out.println(")");
            }

            Object obj =
                    cls.getDeclaredConstructor()
                            .newInstance();

            Method m =
                    cls.getDeclaredMethod(
                            "displayInfo",
                            String.class
                    );

            m.invoke(obj, "Sravya");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}