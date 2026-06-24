public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser =
                new MobileApp("Sravya");

        Observer webUser =
                new WebApp("Rahul");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockData(
                "Infosys",
                1540.75);

        stockMarket.setStockData(
                "TCS",
                3895.50);
    }
}