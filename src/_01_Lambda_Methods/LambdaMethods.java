package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	
	
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
//		printCustomMessage((s)->{
//			for(int i = 0; i < 10; i++) {
//				System.out.println(s);
//			}
//		}, "repeat");
//		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
//		printCustomMessage((r)->{
//			 String backwards="";
//			for (int i = r.length(); i > 0; i--) {
//				backwards+=r.charAt(i-1);
//			}
//			System.out.println(backwards);
//			
//		}, "moo");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((m)->{
			char caphold;
			String done="";
			Random ran=new Random();
			int ranhold;
			for (int i = 0; i < m.length(); i++) {
			ranhold=ran.nextInt(2);
			if (ranhold==0) {
				caphold=Character.toUpperCase(m.charAt(i));
				done+=caphold;
			}
			else {
				done+=m.charAt(i);
			}
			}
			System.out.println(done);
		}, "cheese");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((p)->{
			String s="";
			for (int i = 0; i < p.length(); i++) {
				s+=p.charAt(i);
				s+=".";
			}
			System.out.println(s);
		}, "Europe");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	printCustomMessage((v)->{
		String finished="";
		for (int i = 0; i < v.length(); i++) {
			if (v.charAt(i)!='a'&& v.charAt(i)!='e' && v.charAt(i)!='i' && v.charAt(i)!='o' && v.charAt(i)!='u') {
				finished+=v.charAt(i);
			}
		}
		System.out.println(finished);
	}, "hobie");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
