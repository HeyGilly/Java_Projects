public class BirthdayCake extends Cake {
    private int candles;

    //constructor changed flavor to chococlate by calling the constructor with super.
    public BirthdayCake(){
        super("chocolate");
    }

    public int getCandles() {return candles;}
    public void setCandles(int candles) {this.candles = candles;}
}
