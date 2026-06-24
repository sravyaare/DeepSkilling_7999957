public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(
                        101,
                        "Algorithms",
                        "Thomas Cormen"),

                new Book(
                        102,
                        "Database Systems",
                        "Elmasri"),

                new Book(
                        103,
                        "Java Programming",
                        "Herbert Schildt"),

                new Book(
                        104,
                        "Operating Systems",
                        "Galvin"),

                new Book(
                        105,
                        "Python Basics",
                        "Mark Lutz")
        };

        System.out.println(
                "Linear Search Result");

        Book linearResult =
                LibrarySearch.linearSearch(
                        books,
                        "Java Programming");

        if (linearResult != null) {

            System.out.println(linearResult);
        }

        System.out.println();

        System.out.println(
                "Binary Search Result");

        Book binaryResult =
                LibrarySearch.binarySearch(
                        books,
                        "Java Programming");

        if (binaryResult != null) {

            System.out.println(binaryResult);
        }
    }
}