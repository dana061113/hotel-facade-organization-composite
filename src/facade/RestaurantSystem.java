package facade;

public class RestaurantSystem {

    public void bookTable(String name) {
        System.out.println(name + " үшін стол брондалды");
    }

    public void orderFood(String food) {
        System.out.println(food + " заказ берілді");
    }
}
