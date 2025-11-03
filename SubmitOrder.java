import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class SubmitOrder {
    public static void main(String[] args) {
        Dish_11_3[] dishes=new Dish_11_3[]{
            new Dish_11_3("油焖大虾",56.00,1),
            new Dish_11_3("蒜蓉青菜",23.00,1)
        };
        System.out.println("购物车菜品：");
        showDish(dishes);
        Order_11_3 order=new Order_11_3();
        LocalDateTime now=LocalDateTime.now();
        System.out.print("是否提交订单（是输入Y，否输入N）：");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if("Y".equals(s.toUpperCase()))
        {
            System.out.println("订单已生成，详情如下：");
            DateTimeFormatter fm=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            order.setOrderTime(fm.format(now));
            order.setId(System.currentTimeMillis()+"");
           order.setDishes(dishes);
            System.out.println("订单编号："+order.getId());
            showDish(dishes);
            System.out.println("提交订单时间："+order.getOrderTime());
            LocalDateTime ld=now.plusMinutes(10);
            System.out.println("订单配送时间："+fm.format(ld));

        }
    }
    public static void showDish(Dish_11_3[] dishes)
    {
        System.out.println("菜品名称     单价（元）    数量（份）    金额（元）");
        System.out.println("------------------------------");
        double sum=0;
        for(int i=0;i<dishes.length;i++)
        {
            double p=dishes[i].getPrice();
            int c=dishes[i].getCount();
            sum=sum+p*c;
            System.out.println(dishes[i].getName()+"    "+p+"    "+c+"    "+p*c);
        }
        System.out.println("订单总金额："+sum+"元");
    }
}
