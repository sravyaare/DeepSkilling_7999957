import java.util.HashMap;

public class InventoryManager {

    private HashMap<Integer, Product> inventory =
            new HashMap<>();

    public void addProduct(Product product) {

        inventory.put(
                product.getProductId(),
                product);

        System.out.println(
                product.getProductName()
                        + " added successfully.");
    }

    public void updateProduct(
            int productId,
            int quantity,
            double price) {

        Product product =
                inventory.get(productId);

        if (product != null) {

            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println(
                    "Product updated successfully.");
        }
        else {

            System.out.println(
                    "Product not found.");
        }
    }

    public void deleteProduct(int productId) {

        if (inventory.remove(productId) != null) {

            System.out.println(
                    "Product deleted successfully.");
        }
        else {

            System.out.println(
                    "Product not found.");
        }
    }

    public void displayInventory() {

        System.out.println("\nInventory Details");

        for (Product product :
                inventory.values()) {

            System.out.println("------------------");
            System.out.println(product);
        }
    }
}