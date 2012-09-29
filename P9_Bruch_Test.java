
public class P9_Bruch_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P9_Bruch bruch1 = new P9_Bruch(2,3);
		P9_Bruch bruch2 = new P9_Bruch(7,4);
		P9_Bruch bruchMultipliziert = bruch1.multiplizieren(bruch2);		
		System.out.println(bruchMultipliziert);
	}

}
