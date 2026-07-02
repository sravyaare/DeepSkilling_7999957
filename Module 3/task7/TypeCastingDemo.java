public class TypeCastingDemo {

    public static void main(String[] args) {

        double productPrice = 499.99;
        int roundedPrice = (int) productPrice;

        int quantity = 25;
        double quantityInDouble = (double) quantity;

        System.out.println("Original Double Value: " + productPrice);
        System.out.println("After Converting to Int: " + roundedPrice);

        System.out.println("Original Int Value: " + quantity);
        System.out.println("After Converting to Double: " + quantityInDouble);
    }
}