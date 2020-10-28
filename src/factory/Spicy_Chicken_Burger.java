package factory;

//麦辣鸡腿堡套餐
public class Spicy_Chicken_Burger implements KFC {

    @Override
    public Drink makeDrink() {
        System.out.print("香辣鸡腿堡套餐饮料：");
        return new M_CoCa_Cola();
    }

    @Override
    public Food makeFood() {
        System.out.print("香辣鸡腿堡套餐主食：");
        return new M_Chicken_Burger();
    }

    @Override
    public OtherFood makeOtherFood() {
        System.out.print("香辣鸡腿堡辅食：");
        return new M_Chicken_Wings();
    }
}
