package project;

// Factory class that would return object of different class according to the wish of customer

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