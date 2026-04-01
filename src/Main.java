class Mobile {
    String brand;
    int price;
    static String name;

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public void show() {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name);
    }

}

public class Main {
    public static void main(String[] args) {

        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 2000;
        obj.name = "SmartPhone";

        Mobile obj2 = new Mobile();

    }

}