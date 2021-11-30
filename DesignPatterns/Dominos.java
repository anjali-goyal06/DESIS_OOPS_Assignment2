package project;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;


/* 
    A class implimented from Restaurant interface.
    Contains a ArrayList of the food items present
    And 2 method implemented from the parent interface
    -menu() and order()

*/

public class Dominos implements Restaurants{

    static private ArrayList<String> foodItems;

   // static initialization block that runs once throughtout it's lifetime 
   // in the starting beforecreation of the object
    static{
        foodItems = new ArrayList<>();
        String[] array = {"VEG PIZZA","SIDES & BEVERAGES","PASTA","Cheese pizza","Burger"};
        Collections.addAll(foodItems, array);
    }


    @Override
    public void menu() {

        System.out.println("\n\n Dominos Menu : \n");
        int i=1;
        for(String items : foodItems){
            System.out.println(i + " " + items);
            i++;
        }
    }

    @Override
    public void order() {
        Scanner sc= new Scanner(System.in); 

        System.out.print("\nEnter the food item no. you want to order :  ");
        int a = sc.nextInt();

        System.out.println(foodItems.get(a-1) + " 's Order placed successfully ");
    }

}
