package Homework_9.Clonable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product("iPad Air", 1000);
        Product copyOfProduct = (Product) product.clone();

        product.setName("iPad Pro");
        System.out.println(product.getName());
        System.out.println(copyOfProduct.getName());
    }
}
