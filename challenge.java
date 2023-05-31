import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

class challenge{
    public static class Visit {
        protected int quantity;
        protected double pricePerLt;
    
        public Visit(int quantity, double pricePerLt){
            this.quantity = quantity;
            this.pricePerLt = pricePerLt;
        }
    
        double getPricePerLt(){
            return this.pricePerLt;
        }
    
        int getQuantity(){
            return this.quantity;
        }
    }

    private static final double CURRENT_QUANTITY=40;
    private static final int TOTAL_VISITS=4;

    public static void main(String args[]){  
        Random r = new Random();

        ArrayList<Visit> visits = new ArrayList<Visit>();   //Visits array
        ArrayList<Double> priceArray = new ArrayList<Double>();    //Array of prices
        int random_qnt;
        double random_price;

        for(int i=0; i<TOTAL_VISITS;i++){  //Add visits
            random_qnt = r.nextInt(50) + 1;
            random_price = 1.80 + r.nextDouble()*0.5;
            random_price = Math.round(random_price * 100.0) / 100.0;
            visits.add(new Visit(random_qnt, random_price));
        }
        System.out.println(visits.size());

        for(int i=0; i<visits.size();i++){  //Print visits
           System.out.println("Visit no: " + i + " Qnt: " + visits.get(i).getQuantity()  + " Price: " + visits.get(i).getPricePerLt());
        }

        int litters = 0;
        for(int i=0; i<visits.size();i++){  
            litters = visits.get(i).getQuantity();
            for(int j=0; j<litters;j++){ 
                priceArray.add(visits.get(i).getPricePerLt());
            }
        }
       
        double litterCounter = 0;
        double priceCounter = 0.0;
        for(int i=priceArray.size()-1;i>0;i--){
            if(CURRENT_QUANTITY > litterCounter){
                litterCounter++;
                priceCounter = priceCounter + priceArray.get(i);
            }else{
                break;
            }
        }
        System.out.println("Current value: "+ Math.round(priceCounter * 100.0) / 100.0);
    
    }  
}  