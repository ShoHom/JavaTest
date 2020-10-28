package decoration;

public class MilkTeaMaterial implements MilkTea{
    private MilkTea milkTea;
    public double price;
    public MilkTeaMaterial(MilkTea milkTea) {
        this.milkTea = milkTea;
    }
    public void makeMilkTea() {
        milkTea.makeMilkTea();
    }
    public void addMore(String s) {
        switch (s) {
            case "布丁":price+=2;break;
            case "黑砖":price+=2;break;
            case "椰果":price+=2;break;
            default:System.out.println("啥都不加");break;
        }
    }
}