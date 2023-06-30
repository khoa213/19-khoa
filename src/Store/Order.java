package Store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Order {
    private List<OrderItem> orderItems;
    private Customer customer;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order(Customer customer) {
        this.customer = customer;
        orderItems=new ArrayList<>();
    }

    public void addOrder(Product product,int quantity) {
        boolean isCheckQuantity = checkQuantity(quantity,product);
        if (isCheckQuantity) {
            System.out.println("product is not enough");
            return;
        } else {
            product.setQuantity(product.getQuantity()-quantity);
        }
        if (orderItems.size()==0) {
            orderItems.add(new OrderItem(product,quantity));
            return;
        }
        for (OrderItem item1:orderItems) {
            if (item1.getProduct().getName()== product.getName()){
                item1.setQuantity(item1.getQuantity()+ quantity);
            } else {
                orderItems.add(new OrderItem(product,quantity));
            }
        }
    }
    private boolean checkQuantity(int quantity,Product product) {
        if (product.getQuantity() <= quantity) {
            return true;
        }
        return false;
    }


    public void displayOrder() {
//        System.out.println("abc");
        System.out.println(customer.getName());
        for (OrderItem item:orderItems) {
            System.out.println(item.getProduct().getName()+" "+item.getQuantity());
        }
    }
}
