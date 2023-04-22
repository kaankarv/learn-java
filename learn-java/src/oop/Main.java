package oop;

public class Main {

    public static void main(String[] args){

        Product product1 = new Product(1, "MSI", 15000, "16 gb ram", 10);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo");
        product2.setDetail("16 gb ram");
        product2.setDiscount(10);
        product2.setUnitPrice(13000);

        System.out.println(product1.getUnitPriceAfterDiscount());
        System.out.println(product2.getUnitPriceAfterDiscount());

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Icecek");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Yiyecek");

        System.out.println(category1.getName());
        System.out.println(category2.getName());

    }
}
