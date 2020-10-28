package decoration;

public class OriginalMilkTea implements MilkTea{
    double price;
    public void makeMilkTea() {
        price+=5;
        System.out.println("奶茶");
    }
}
