package exercise.srp;

public class PrinterFactory {
    private Post post;

    public PrinterFactory(Post post){
        this.post = post;
    }

    public void consolePrinter(){
        System.out.println(this.post.getTitle());
        System.out.println(this.post.getBody());
        System.out.println(this.post.getAuthor());
    }

    public void jsonPrinter() {
        String s;
        s= "{" + this.post.getTitle() + "," + this.post.getBody() + "," + this.post.getAuthor() + "}";
        System.out.print(s);
    }

}
