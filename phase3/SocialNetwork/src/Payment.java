import java.util.ArrayList;
import java.util.HashMap;

public class Payment {

    private HashMap<String,Integer> paymentMethods = new HashMap<String, Integer>();

    public HashMap<String, Integer> getPaymentMethods() {
        return paymentMethods;
    }

    Payment(){
        paymentMethods.put("Credit Card",500);
        paymentMethods.put("PayPal",100);
    }

    public Boolean pay(String method , int price){
        if(!paymentMethods.containsKey(method)) return false ;
        if(paymentMethods.get(method)>=price){
            paymentMethods.put(method,paymentMethods.get(method)-price);
            return true;
        }
        return false;
    }
}

