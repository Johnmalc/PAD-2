public class P6_Primzahlen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] gestrichen;
		int intervall = 1000000;
		int i, j, z;

		gestrichen = new boolean[intervall + 1]; //Felder von Boolean-Arrays sind standardmaessig mit false initialisiert

		for (i = 2; i * i <= intervall; i++) {
			if (!gestrichen[i]) {
				for (j = i * i; j <= intervall; j += i) {
					gestrichen[j] = true;
				}
			}
		}

		System.out.println("Die ersten 100 Primzahlen:");
		for (i = 2, z = 0; i <= intervall && z < 100; i++) {
			if (!gestrichen[i]) {
				System.out.println(i);
				z++;
			}
		}

		/* rueckwaerts */
		System.out.println("Die letzten 100 Primzahlen:");
		for (i = intervall, z = 0; i <= intervall && z < 100; i--) {
			if (!gestrichen[i]) {
				System.out.println(i);
				z++;
			}
		}

	}

}
