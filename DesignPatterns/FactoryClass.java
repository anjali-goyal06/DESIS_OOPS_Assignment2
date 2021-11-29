package project;

public class FactoryClass {
	
   public Restaurants getClass(int x){
      
        switch (x) {
                case 1:
                    return new Dominos();

                case 2:
                    return new KFC();
                   
                case 3:
                    return new McDonalds();
                    

                default:
                    return null;
        }

        
   }
}