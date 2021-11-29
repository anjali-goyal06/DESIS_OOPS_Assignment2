package project;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class McDonalds implements Restaurants{

    ArrayList<String> foodItems;

    public McDonalds(){
        foodItems = new ArrayList<>();
        String[] array = {"McAloo","Mexican McAloo Tikki","Big Mac","Sausage Burrito"};
        Collections.addAll(foodItems, array);
    }

    @Override
    public void menu() {
        int i=1;

        System.out.println("\n\n MacDonalds Menu : \n");

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
