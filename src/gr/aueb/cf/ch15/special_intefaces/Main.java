package gr.aueb.cf.ch15.special_intefaces;

public class Main {

    public static void main(String[] args) {
        IProduct book = new Book();
        IProduct cd = new CompactDisc();

        deliver(book);
        deliver(cd);
    }

    public static void deliver(IProduct product) {
        if (product instanceof Book) {
            System.out.println("Delevering book...");
        } else if (product instanceof CompactDisc) {
            System.out.println("Delevering CD...");
        } else {
            throw new IllegalArgumentException("Invalid product type.");
        }
    }
}
