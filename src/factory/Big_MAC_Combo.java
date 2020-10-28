package factory;

//巨无霸套餐
public class Big_MAC_Combo implements KFC {

    @Override
    public Drink makeDrink() {
        System.out.print("巨无霸套餐饮料：");
        return new M_Orange_Juice();
    }

    @Override
    public Food makeFood() {
        System.out.print("巨无霸套餐主食：");
        return new M_Big_Mac();
    }

    @Override
    public OtherFood makeOtherFood() {
        System.out.print("巨无霸套餐辅食：");
        return new M_French_Fries();
    }
}
