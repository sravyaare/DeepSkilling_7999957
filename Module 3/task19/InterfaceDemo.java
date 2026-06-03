interface Playable {

    void play();
}

class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Guitar is playing a melody.");
    }
}

class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Piano is playing a tune.");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        System.out.println("Guitar:");
        guitar.play();

        System.out.println("Piano:");
        piano.play();
    }
}