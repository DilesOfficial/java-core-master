public class Main {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(8, 2);
        int r2 = obj.sub(5, 2);
        int r3 = obj.multiply(3, 2);
        int r4 = obj.multiply(4, 2);
        System.out.println(r1 + " " + r2  + " " + r3 + " " + r4);
    }
}