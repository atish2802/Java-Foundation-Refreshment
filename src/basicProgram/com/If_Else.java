package basicPrograms.in;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Aaaj Kya hai , Bhai ?  \n bada khush hai ");
		
		String day = sc.next();
		
		if(day.equals("Sunday")) {
			System.out.println("Haaan bhai mujhe Pata tha ki aaj Sunday hai esiliye Khush hoga , Maje kar ");
		}else if(day.equals("Monday")) {
			System.out.println("Chal bhai Kaam pe lag ja , Jo huaa abhi tak sab bhul ja naii Shuruaat kar ");
		}else if(day.equals( "Tuesday")) {
			System.out.println("Kal ka kuch bacha ho to vo complete kar bhai our aage badh bhai ");	
		}else if(day.equals( "Wednasday")) {
			System.out.println("Well Done Bhai  , Tune 2 din nikal liye hai es hafte ke ab bas 3 din karna hai fir 1 din ki rest le lena ");
		}else if(day.equals( "Thursday")) {
			System.out.println("2 din bas abhi lage reh bhai ");
		}else if(day.equals( "Friday")) {
			System.out.println("Sahi kar raha hai bhai , abhi bas aaj our kal karna hai fir tu rest le sakta hai ");
		}else if(day.equals( "Saturday")){
			System.out.println("Bhai bas aaj kar le fir kal teri Chutti hai , Maje kar lena ");
		}else {
			System.out.println("I think bhai tune Ya to spelling mistake ki hai ya tune 'days' ke naam galat dale hai \n Check kar le ek baar   ");
		}
	}
}
