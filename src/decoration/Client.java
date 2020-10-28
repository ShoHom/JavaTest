package decoration;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        while (true) {
            System.out.println("~~~欢迎光临锐锐FastFood~~~\r\n想吃汉堡还是喝奶茶？");
            Scanner sc = new Scanner(System.in);
            String order = sc.next();
            if (order.equals("汉堡")) {
                System.out.println("请选择汉堡的类型\r\n1.鸡肉汉堡\r\n2.蔬菜汉堡\r\n3.番茄汉堡");
                String type = sc.next();
                switch (type) {
                    case "鸡肉汉堡":
                        System.out.println("需要加牛肉饼吗？今天锐锐宝贝开心，加料只需5元哦~");
                        break;
                    case "蔬菜汉堡":
                        System.out.println("需要加猪肉饼吗？今天培林宝贝开心，加料只需3元哦~");
                        break;
                    case "番茄汉堡":
                        System.out.println("需要加太阳蛋吗？今天潮辉宝贝开心，加料只需2元哦~");
                        break;
                    default:
                        System.out.println("请输入菜样名称");
                }
                String ifAdd = sc.next();
                new DIYBurger(new OriginalBurger()).addMore(type, ifAdd);
            } else if (order.equals("奶茶")) {
                System.out.println("请选择奶茶需要加的配料\r\n1.布丁\r\n2.黑砖\r\n3.椰果");
                String type = sc.next();
                switch (type) {
                    case "布丁":
                        System.out.println("好的布丁2元 锐锐宝贝给您加上");
                        break;
                    case "黑砖":
                        System.out.println("好的黑砖2元 培林宝贝给您加上");
                        break;
                    case "椰果":
                        System.out.println("好的椰果2元 潮辉宝贝给您加上");
                        break;
                    default:
                        System.out.println("请输入菜样名称");
                }
                new MilkTeaMaterial(new OriginalMilkTea()).addMore(type);
            } else
                System.out.println("汉堡和奶茶，选一样！");
        }
    }

}
