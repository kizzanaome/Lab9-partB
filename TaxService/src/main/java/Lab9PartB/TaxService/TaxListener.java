package Lab9PartB.TaxService;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TaxListener {
    @JmsListener(destination = "taxQueue")
    public  void  receiveMessage(String message){
        System.out.println("TaxService received alert: " + message);
    }

}
