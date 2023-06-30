package Store;

public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Dat",1);
        Product product1 = new Product("ti vi",10,500);
        Order order = new Order(cus1);

        order.addOrder(product1,2);
        order.addOrder(product1,2);
        order.addOrder(product1,5);
        order.displayOrder();
        product1.displayProduct();

    }
}
