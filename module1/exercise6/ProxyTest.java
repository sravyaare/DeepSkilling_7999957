public class ProxyTest {

    public static void main(String[] args) {

        Image image = new ProxyImage("CompanyLogo.png");

        System.out.println("First Display Request");
        image.display();

        System.out.println();

        System.out.println("Second Display Request");
        image.display();
    }
}