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
public class P4_GroessterTeiler_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl2 = -1;
		int zahl1 = -1;

		while (zahl2 < 0) {
			zahl2 = IOTools.readInt("Bitte erste Zahl eingeben: ");
		}

		while (zahl1 < 0) {
			zahl1 = IOTools.readInt("Bitte zweite Zahl eingeben: ");
		}

		while (zahl2 != 0) {
			if (zahl1 > zahl2) {
				zahl1 = zahl1 - zahl2;
			} else {
				zahl2 = zahl2 - zahl1;
			}
		}
		System.out.println(zahl1);
	}

}
