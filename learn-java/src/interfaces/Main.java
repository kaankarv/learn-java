package interfaces;

public class Main {
    public static void main(String[] args){

        CustomerManager customerManager = new CustomerManager();

        Customer kaan = new Customer(1,"kaan", "karvan");
        Customer engin = new Customer(2,"engin", "demir");

        customerManager.add(kaan);
        customerManager.delete(engin);
    }
}
