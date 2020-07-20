package eclipse_workspace.cleancode;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger log = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        double p,t,r;
        log.info("Enter the amount");
        p = sc.nextDouble();
        log.info("Enter the time");
        t = sc.nextDouble();
        log.info("Enter the intrest");
        r = sc.nextDouble();
        intrest obj = new intrest();
        double si = obj.simpleIntrest(p,t,r);
        double ci = obj.compoundIntrest(p,t,r);
        log.info("Simple Intrest is "+si);
        log.info("Compound Intrest is "+ci);
        
        
        
        
            }
}
