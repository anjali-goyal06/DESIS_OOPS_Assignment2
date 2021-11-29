package project;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class KFC implements Restaurants{
    private ArrayList<String> foodItems;

    public KFC(){
        foodItems = new ArrayList<>();
        String[] array = {"Classic Zinger Meal","Super Snacker Combo","Rice Bowlz","Mingles Bucket Meal"};
        Collections.addAll(foodItems, array);
    }

    @Override
    public void menu() {
        System.out.println("\n\n KFC Menu : \n");
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
