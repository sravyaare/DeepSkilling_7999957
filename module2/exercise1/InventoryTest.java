public class InventoryTest {

    public static void main(String[] args) {

        InventoryManager manager =
                new InventoryManager();

        Product p1 =
                new Product(
                        101,
                        "Laptop",
                        20,
                        55000);

        Product p2 =
                new Product(
                        102,
                        "Mouse",
                        100,
                        700);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayInventory();

        manager.updateProduct(
                101,
                25,
                57000);

        manager.deleteProduct(102);

        manager.displayInventory();
    }
}