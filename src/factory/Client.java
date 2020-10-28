package factory;

public class Client {
    public static void main(String[] args) {
        Big_MAC_Combo combo = new Big_MAC_Combo();
        combo.makeFood().show();
        combo.makeDrink().show();
        combo.makeOtherFood().show();
        Spicy_Chicken_Burger spicy = new Spicy_Chicken_Burger();
        spicy.makeFood().show();
        spicy.makeDrink().show();
        spicy.makeOtherFood().show();
    }
}
