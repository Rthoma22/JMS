package blah;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	  @JmsListener(destination = "texas", containerFactory = "myFactory")
	    public void receiveMessage(Email email) {
	        System.out.println("Received <" + email + ">");
	    }

}
