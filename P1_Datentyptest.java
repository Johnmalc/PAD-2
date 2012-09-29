public class P1_Datentyptest {
	
	public static void main(String[]args)
	{	
		System.out.println("Uebersicht der maximalen und minimalen Werte fuer Datentypen");
		System.out.println("------------------------------------------------------------");
		System.out.println("groesster Int-Wert: "+Integer.MAX_VALUE);
		System.out.println("groesster Long-Wert: "+Long.MAX_VALUE);
		System.out.println("kleinster Int-Wert: "+Integer.MIN_VALUE);
		System.out.println("kleinster Long-Wert: "+Long.MIN_VALUE);
		
		
		System.out.println("Aufgabe");
		System.out.println("------------------------------------------------------------");
		System.out.println("groesster Int-Wert("+Integer.MAX_VALUE+")+1 ist: "+(Integer.MAX_VALUE+1));
		System.out.println("groesster Long-Wert("+Long.MAX_VALUE+")+1 ist: "+(Long.MAX_VALUE+1));

		System.out.println("kleinster Int-Wert("+Integer.MIN_VALUE+"-1: "+(Integer.MIN_VALUE-1));
		System.out.println("kleinster Long-Wert("+Long.MIN_VALUE+"-1: "+(Long.MIN_VALUE-1));
		
		System.out.println("Größte Float Zahl("+Float.MAX_VALUE+")*10: "+(Float.MAX_VALUE*10));
		System.out.println("Größte Double Zahl("+Double.MAX_VALUE+")*10: "+(Double.MAX_VALUE*10));
		
		System.out.println("Kleinste positive Float Zahl("+Float.MIN_VALUE+")/10: "+(Float.MIN_VALUE/10));
		System.out.println("Kleinste positive Double Zahl("+Double.MIN_VALUE+")/10: "+(Double.MIN_VALUE/10));	
	}
}
