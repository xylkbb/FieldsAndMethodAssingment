public class app {
    public static void main(String[] args) {

        Library A = new Library();
        A.name = "A";
        A.addBooks(100);

        Library B = new Library();
        B.name = "A";
        B.addBooks(160);

        System.out.println(Library.getTotalBooks());

    }
}