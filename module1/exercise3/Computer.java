public class Computer {

    private String cpu;
    private int ram;
    private int storage;
    private boolean graphicsCard;
    private boolean wifiEnabled;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifiEnabled = builder.wifiEnabled;
    }

    public void displayDetails() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("WiFi Enabled: " + wifiEnabled);
    }

    public static class Builder {

        private String cpu;
        private int ram;
        private int storage;
        private boolean graphicsCard;
        private boolean wifiEnabled;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWifiEnabled(boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}