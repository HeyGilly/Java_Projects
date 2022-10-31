public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake Price : " + cake.getPrice());

        BirthdayCake BDayCake = new BirthdayCake();
        System.out.println("Cake flavor: " + BDayCake.getFlavor());
        System.out.println("Cake Price : " + BDayCake.getPrice());

        WeddingCake wedding = new WeddingCake();
        wedding.setFlavor("strawberry");
        wedding.setPrice(12.99);
        System.out.println("Cake flavor: " + wedding.getFlavor());
        System.out.println("Cake Price : " + wedding.getPrice());


    }
}