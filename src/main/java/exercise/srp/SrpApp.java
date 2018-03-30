package exercise.srp;

public class SrpApp {

    public static void main(String[] args) {
        //TODO Try to print a post to console
        Post post = new Post("Andrea", "Article", "This is a body");
        PrinterFactory pf = new PrinterFactory(post);
        pf.jsonPrinter();
    }
}
