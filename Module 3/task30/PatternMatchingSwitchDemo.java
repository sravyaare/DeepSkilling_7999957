public class PatternMatchingSwitchDemo {

    static void checkType(Object value) {

        if (value instanceof Integer) {
            System.out.println(value + " is an Integer value.");
        } 
        else if (value instanceof String) {
            System.out.println("\"" + value + "\" is a String value.");
        } 
        else if (value instanceof Double) {
            System.out.println(value + " is a Double value.");
        } 
        else if (value instanceof Boolean) {
            System.out.println(value + " is a Boolean value.");
        } 
        else if (value == null) {
            System.out.println("The object is null.");
        } 
        else {
            System.out.println("Unknown object type.");
        }
    }

    public static void main(String[] args) {

        checkType(100);
        checkType("Java");
        checkType(45.75);
        checkType(true);
        checkType(null);
    }
}