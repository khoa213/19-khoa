import java.util.*;

public class HashMapExercises {
    public static void main(String[] args) {
//        Election elec = new Election();
//        elec.vote("Obama");
//        elec.vote("Obama");
//        elec.vote("Obama");
//        elec.vote("Obama");
//        elec.vote("Obama");
//        elec.vote("Obama");
//        elec.vote("Lincoln");
//        elec.vote("Lincoln");
//        elec.vote("Lincoln");
//        elec.vote("Lincoln");
//        elec.vote("Lincoln");
//        elec.vote("Lincoln");
//        elec.vote("Lincoln");
//
//        elec.winner();
        Inventory inventory = new Inventory();
        Product apple = new Product("apple",12.5);
        Product apple1 = new Product("cold apple",12.5);
        List<Product> store = new LinkedList<>();
        store.add(apple);
        store.add(apple1);
        inventory.add("apple",store);
        inventory.show("apple");

    }
}
class Election {
    HashMap<String,Integer> candidates = new HashMap<>();

    void vote(String name) {
        int count=-1;
        if (candidates.get(name) == null) {
            count=1;
        }
        if (candidates.containsKey(name)) {
            count = candidates.get(name);
            count++;
        }
        candidates.put(name,count);

    }
    void winner() {
        System.out.println(Collections.max(candidates.entrySet(), Map.Entry.comparingByValue()).getKey()+" "
                +Collections.max(candidates.entrySet(), Map.Entry.comparingByValue()).getValue());

    }
}
class Inventory {
    HashMap<String, List <Product> > products = new HashMap<>();
    void add(String name, List <Product> product) {
        products.put(name,product);
    }
    void show(String name) {
        System.out.println(products.get(name));
    }

}
class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
