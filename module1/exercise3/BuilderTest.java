public class BuilderTest {

    public static void main(String[] args) {

        Computer officeComputer = new Computer.Builder()
                .setCpu("Intel i3")
                .setRam(8)
                .setStorage(256)
                .setWifiEnabled(true)
                .build();

        Computer gamingComputer = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam(32)
                .setStorage(1024)
                .setGraphicsCard(true)
                .setWifiEnabled(true)
                .build();

        System.out.println("Office Computer");
        officeComputer.displayDetails();

        System.out.println();

        System.out.println("Gaming Computer");
        gamingComputer.displayDetails();
    }
}