package project;


/* Acts as a interface between Restaurant and FoodOrdereringAppInterface */

public class AdapterClass implements FoodOrderingAppInterface {
    Restaurants restaurant; // Need to implement the interface customer expects to use.

    // Constructor
    public AdapterClass(Restaurants restaurant){
         // we need reference to the object we are adapting
        this.restaurant = restaurant;
    }

    @Override  // Display menu of a particular restaurant
    public void showMenu(){                     // translate the methods appropriately
        restaurant.menu();
    }

    @Override                                   // orderFood from a particular restaurant
    public void orderFood() {                   // translate the methods appropriately
        restaurant.order();
    }

}
