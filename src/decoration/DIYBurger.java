package decoration;

public class DIYBurger implements Hamburger{
    private Hamburger hamburger;
    public double price;
    public DIYBurger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public void makeHamburger(String tpye) {
        hamburger.makeHamburger(tpye);
    }

    public void addMore(String type, String s) {
        switch (type) {
            case "鸡肉汉堡":
                if (s.equals("加")){price+=5;System.out.println("好的锐锐宝贝给您的鸡肉汉堡加 牛肉饼\r\n一共"+price+"元 这边扫码付款哦！");}
                else System.out.println("回答加/不加");
                break;
            case "蔬菜汉堡":
                if (s.equals("加")){price+=3;System.out.println("好的培林宝贝给您的蔬菜汉堡加 猪肉饼\r\n一共"+price+"元 这边扫码付款哦！");}
                else System.out.println("回答加/不加");
                break;
            case "番茄汉堡":
                if (s.equals("加")){price+=2;System.out.println("好的潮辉宝贝给您的番茄汉堡加 太阳蛋\r\n一共"+price+"元 这边扫码付款哦！");}
                else System.out.println("回答加/不加");
                break;
        }
    }
}
