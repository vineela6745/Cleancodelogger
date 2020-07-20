package eclipse_workspace.cleancode;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class construction {
	private static final Logger log = LogManager.getLogger(construction.class);

	public construction() {
		// TODO Auto-generated constructor stub
	}
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		log.info("Enter the area of house");
        double feet = sc.nextInt();
        log.info("If you want a home with Standarad Materials then press 1");
        log.info("If you want a home with above Standarad Materials then press 2");
        log.info("If you want a home with high Standarad Materials then press 3");
        log.info("If you want a home with high Standarad Materials and fully automated home then press 4");

        int op = sc.nextInt();
        materials obj2 = new materials();
        double ans;
        switch(op) {
        case 1: ans = obj2.sm(feet);
           break;
        case 2: ans = obj2.asm(feet);
           break;
        case 3: ans = obj2.hsm(feet);
           break;
        case 4: ans = obj2.hfsm(feet);
           break;
        default:  log.info("Error! Enter correct operator");
           return;
     }
        log.info("The total construction cost is "+ans);


	}

}
