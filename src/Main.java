class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println("Brand: " + obj.brand + ", Price: " + obj.price + ", Name: " + name);
    }

}

public class Main {
    public static void main(String[] args) {

        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 2000;
        obj.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        obj2.name = "SmartPhone";

        obj.name = "Foldable";
        obj2.name = "Mobile";
        Mobile.name = "NewMobile";

        obj.show();
        obj2.show();

        Mobile.show1(obj);
    }

}