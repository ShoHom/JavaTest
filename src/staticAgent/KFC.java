package staticAgent;

public class KFC implements Hamburger {
    RealHamburger hamburger;
    KFC(RealHamburger hamburger) {
        super();
        this.hamburger = hamburger;
    }
    public void getHamburger() {
        makingBurger();
        hamburger.getHamburger();
        cleanMachine();
    }
    public void makingBurger() {
        System.out.println("正在切面包片...");
        System.out.println("正在炸肉...");
    }

    public void cleanMachine() {
        System.out.println("正在清理设备...");
    }
}
