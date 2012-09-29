public class P2_impliziteTypanpassung {

	/**
	 * @param args
	 */
	public static double fliesskommaZahlD;
    
	public static float fliesskommaZahlF;
	
	public static float groessteFloat = Float.MAX_VALUE;
	public static float kleinsteFloat = Float.MIN_VALUE;

	public static String t = "-------------------------------------------------------------";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		fliesskommaZahlD = Integer.MAX_VALUE;
		System.out.println("Datentyp\tVorher\t\tZuweisung\tNachher");
		System.out.println("Double\t\t"+fliesskommaZahlD+"\t"+fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		fliesskommaZahlF = Integer.MAX_VALUE;
		System.out.println("Float\t\t"+fliesskommaZahlF+"\t"+fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));

		System.out.println(t);
		System.out.println("Datentyp\tVorher\t\t-1\t\tNachher");
		System.out.print("Double\t\t"+fliesskommaZahlD+"\t");
		fliesskommaZahlD -= 1;
		System.out.println(fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		System.out.print("Float\t\t"+fliesskommaZahlF+"\t");
		fliesskommaZahlF -= 1;
		System.out.println(fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));

		fliesskommaZahlD = Integer.MAX_VALUE;
		fliesskommaZahlF = Integer.MAX_VALUE;		
		System.out.println(t);
		System.out.println("Datentyp\tVorher\t\t-10\t\tNachher");
		System.out.print("Double\t\t"+fliesskommaZahlD+"\t");
		fliesskommaZahlD -= 10;
		System.out.println(fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		System.out.print("Float\t\t"+fliesskommaZahlF+"\t");
		fliesskommaZahlF -= 10;
		System.out.println(fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));	
		
		
		fliesskommaZahlD = Integer.MAX_VALUE;
		fliesskommaZahlF = Integer.MAX_VALUE;
		System.out.println(t);
		System.out.println("Datentyp\tVorher\t\t/10\t\tNachher");
		System.out.print("Double\t\t"+fliesskommaZahlD+"\t");
		fliesskommaZahlD /= 10;
		System.out.println(fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		System.out.print("Float\t\t"+fliesskommaZahlF+"\t");
		fliesskommaZahlF /= 10;
		System.out.println(fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));
		
		fliesskommaZahlD = Integer.MAX_VALUE;
		fliesskommaZahlF = Integer.MAX_VALUE;
		System.out.println(t);
		System.out.println("Datentyp\tVorher\t\t-10/10\t\tNachher");
		System.out.print("Double\t\t"+fliesskommaZahlD+"\t");
		fliesskommaZahlD = (fliesskommaZahlD-10)/10;
		System.out.println(fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		System.out.print("Float\t\t"+fliesskommaZahlF+"\t");
		fliesskommaZahlF = (fliesskommaZahlF-10)/10;
		System.out.println(fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));		
	
/*
 *  kleinste Integer		
 */
		System.out.println("\nMit kleinstem Integer-Wert\n");
		
		
		fliesskommaZahlD = Integer.MIN_VALUE;
		System.out.println("Datentyp\tVorher\t\tZuweisung\tNachher");
		System.out.println("Double\t\t"+fliesskommaZahlD+"\t"+fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		fliesskommaZahlF = Integer.MIN_VALUE;
		System.out.println("Float\t\t"+fliesskommaZahlF+"\t"+fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));

		System.out.println(t);
		System.out.println("Datentyp\tVorher\t\t-1\t\tNachher");
		System.out.print("Double\t\t"+fliesskommaZahlD+"\t");
		fliesskommaZahlD -= 1;
		System.out.println(fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		System.out.print("Float\t\t"+fliesskommaZahlF+"\t");
		fliesskommaZahlF -= 1;
		System.out.println(fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));

		fliesskommaZahlD = Integer.MIN_VALUE;
		fliesskommaZahlF = Integer.MIN_VALUE;		
		System.out.println(t);
		System.out.println("Datentyp\tVorher\t\t-10\t\tNachher");
		System.out.print("Double\t\t"+fliesskommaZahlD+"\t");
		fliesskommaZahlD += 10;
		System.out.println(fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		System.out.print("Float\t\t"+fliesskommaZahlF+"\t");
		fliesskommaZahlF += 10;
		System.out.println(fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));	
		
		
		fliesskommaZahlD = Integer.MIN_VALUE;
		fliesskommaZahlF = Integer.MIN_VALUE;
		System.out.println(t);
		System.out.println("Datentyp\tVorher\t\t/10\t\tNachher");
		System.out.print("Double\t\t"+fliesskommaZahlD+"\t");
		fliesskommaZahlD /= 10;
		System.out.println(fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		System.out.print("Float\t\t"+fliesskommaZahlF+"\t");
		fliesskommaZahlF /= 10;
		System.out.println(fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));
		
		fliesskommaZahlD = Integer.MIN_VALUE;
		fliesskommaZahlF = Integer.MIN_VALUE;
		System.out.println(t);
		System.out.println("Datentyp\tVorher\t\t-10/10\t\tNachher");
		System.out.print("Double\t\t"+fliesskommaZahlD+"\t");
		fliesskommaZahlD = (fliesskommaZahlD+10)/10;
		System.out.println(fliesskommaZahlD+"\t"+((int)fliesskommaZahlD));
		System.out.print("Float\t\t"+fliesskommaZahlF+"\t");
		fliesskommaZahlF = (fliesskommaZahlF+10)/10;
		System.out.println(fliesskommaZahlF+"\t"+((int)fliesskommaZahlF));
		
		System.out.println("\nMultiplikation des kleinsten und groeßten Werts für Float (und Float konvertiert in Double):\n");
		
		System.out.println(t);
		System.out.println("groesster/kleinster\tVorher\t\t*10\t\tDouble*10");
		System.out.println("groesster\t\t"+groessteFloat+"\t"+(groessteFloat*10)+"\t"+((double)groessteFloat)*10);
		System.out.println("kleinster\t\t"+kleinsteFloat+"\t\t"+(kleinsteFloat/10)+"\t\t"+((double)kleinsteFloat)/10);
	}

}
