public class Dish_11_3 {
    //菜品名称
    private  String name;
    //菜品单价
    private  double price;
    //菜品数量
    private int count;
    Dish_11_3(String name,double price,int count)
    {
        this.name=name;
        this.price=price;
        this.count=count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
