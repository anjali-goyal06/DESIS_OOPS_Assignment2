package project;
import java.util.*;

/* Contains methods used by client */

public class Demo {
    public static void main(String []args){

        Restaurants restaurant;        
        Scanner sc= new Scanner(System.in); 
        boolean flag = true;



        
        while(flag){
            // Ask customer to choose restaurant
            System.out.println("\n\nEnter restaurant from where you want to order");
            System.out.println("1. Dominos\n2.KFC\n3.McDonalds\n");
            System.out.print("Enter choice = ");
            int a= sc.nextInt();


            // create the instance of required class(extended from restaurant)  using factory pattern of creation design pattern
            restaurant = new FactoryClass().getClass(a);
            if(restaurant==null) break;

            
//---------------------------------------------------------------------------------------------------
            // use adapter to use the methods of the different restaurants classes that are
            //  1. menu Function 
            //  2. order Function

            AdapterClass adapter = new AdapterClass(restaurant);
            adapter.showMenu();

            System.out.print("\n\nDo you want to order : (Y/N) ");
            char ch = sc.next().charAt(0);
            if(ch=='Y' || ch=='y')
            adapter.orderFood();
//----------------------------------------------------------------------------------------------------

            System.out.println("\n\n\nDo you want to continue : (Y/N) ");
            ch = sc.next().charAt(0);

            if(ch=='N' || ch=='n') flag=false;
        }


    }
}
