public class Order_11_3 {
    //订单编号
    private String id;
    //提交订单时间
    private String OrderTime;
    //订单项
    private Dish_11_3[] dishes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(String orderTime) {
        OrderTime = orderTime;
    }

    public Dish_11_3[] getDishes() {
        return dishes;
    }

    public void setDishes(Dish_11_3[] dishes) {
        this.dishes = dishes;
    }
}
