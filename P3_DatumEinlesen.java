import Prog1Tools.*;
public class P3_DatumEinlesen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = -1;
		int month = -1;
		int year = -1;
		
		Boolean isFebruar = false;
		Boolean isSchaltjahr = false;
		Boolean isGeraderMonat = false;
		
		
		//String Error = "Ungueltige Eingabe, bitte nochmal";
		
		if(!(year >= 0 && year <= Integer.MAX_VALUE)) {
			System.out.println("Bitte Jahr eingeben: ");
			year = IOTools.readInt();
		}
		
		while(!(month > 0 && month <= 12)) {
			System.out.println("Bitte Monat eingeben: ");
			month = IOTools.readInt();
			
		}
		
		while(!(day > 0 && day <= 31)) {
			System.out.println("Bitte Tag eingeben: ");
			day = IOTools.readInt();
			isGeraderMonat = (month%2 == 0);
			
			if(isGeraderMonat && day > 30) { //überprüfung ob gerader Monat, falls 31 Schleife nochmals
				day = 0;
				continue;
			}
			
			isFebruar = (month == 2);
			
			if(isFebruar)
			{
				isSchaltjahr = ((year%4 == 0) && ((year%100 != 0) || (year%400 == 0)));
				if(day > 29) {
					day = 0;
					continue;					
				} else if(!isSchaltjahr && day == 29) {
					day = 0;
					continue;
				}
			}
		}
		
		System.out.println(day+"."+month+"."+year);	
		
	}

}
