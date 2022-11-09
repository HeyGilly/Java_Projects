public interface Product {

    String getName();
    void setName(String Name);

   default double getPrice(){ return 50;};
    default void setPrice(double price){};
}
