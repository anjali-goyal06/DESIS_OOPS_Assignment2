package project;

public class AdapterClass implements FoodOrderingAppInterface {
    Restaurants restaurant;

    public AdapterClass(Restaurants restaurant){
        this.restaurant = restaurant;
    }

    public void showMenu(){
        restaurant.menu();
    }

    @Override
    public void orderFood() {
        restaurant.order();
    }

}
