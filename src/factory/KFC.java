package factory;

public interface KFC {
    //做饮料
    Drink makeDrink();
    //做主食
    Food makeFood();
    //做辅食
    OtherFood makeOtherFood();
}
