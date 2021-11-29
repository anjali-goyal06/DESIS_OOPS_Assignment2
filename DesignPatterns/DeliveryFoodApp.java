package project;


public class DeliveryFoodApp implements FoodOrderingAppInterface{
    @Override
    public void showMenu(){
        System.out.println("Menu for the app");
    }

    @Override
    public void orderFood() {
        System.out.println("Order food from the app");
    }
}
