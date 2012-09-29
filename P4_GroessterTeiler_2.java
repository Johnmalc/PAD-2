import Prog1Tools.*;

/*

 Aufgabe 4:

 Schreiben Sie ein Programm, das den groessten gemeinsamen Teiler (ggT) zweier (positiver) Ganzzahlen bestimmt.
 Lesen die zwei Zahlen von der Tastatur ein und fangen Sie auch Eingabefehler ab.
 Algorithmus: Wenn eine Zahl zwei Zahlen teilt, so teilt sie auch die Differenz.
 Zusammen mit der kleineren der beiden Zahlen ist das wieder ein Zahlenpaar, das den selben ggT hat.
 Durch fortgesetztes Subtrahieren kommt man zu immer kleineren Zahlen. 
 Wenn die beiden gleich sind, ist dies der gesuchte ggT.

 Uebrigens: Wenn man ausnutzt, dass ein Teiler von zwei Zahlen auch den Rest der Division der beiden teilt,
 kommt man deutlich schneller zum Ziel. Hier ist man fertig, wenn der Rest 0 ist.
 (Das waere dann ein zweites Programm.)
 */

/**
 * @author weber2
 * 
 */
public class P4_GroessterTeiler_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl = -1;
		int divisor = -1;
		int temp = -1;
		
		do {
			do {
				zahl = IOTools.readInt("Bitte groesste Zahl eingeben: ");
			} while (zahl < 0);

			do {
				divisor = IOTools.readInt("Bitte kleinste Zahl eingeben: ");
			} while (divisor < 0);
		} while (divisor >= zahl);
		
		while (zahl % divisor != 0) {
			temp = divisor;
			divisor = zahl % divisor;
			zahl = temp;
		}
		
		System.out.println("ggt: " + divisor);
	}
}
