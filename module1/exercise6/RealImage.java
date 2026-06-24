public class RealImage implements Image {

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image from remote server: " + imageName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageName);
    }
}