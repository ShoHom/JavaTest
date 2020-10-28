package decoration;

public class OriginalBurger implements Hamburger {
    double price;
    public void makeHamburger(String tpye){
        switch (tpye) {
            case "鸡肉汉堡":chickenBurger();break;
            case "蔬菜汉堡":vegetableBurger();break;
            case "番茄汉堡":tomatoBurger();break;
        }
    }
    public void chickenBurger() {
        price+=10;
        System.out.println("鸡肉汉堡");
    }
    public void vegetableBurger() {
        price+=9;
        System.out.println("蔬菜汉堡");
    }
    public void tomatoBurger() {
        price+=8;
        System.out.println("番茄汉堡");
    }
}
