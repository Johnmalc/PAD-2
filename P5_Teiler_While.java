import Prog1Tools.IOTools;

public class P5_Teiler_While {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl, teiler = 0;

		zahl = IOTools.readInt("Bitte Zahl eingeben: ");

		teiler = (zahl % 2 == 0) ? (zahl / 2) - 1 : (zahl / 2);

		System.out.print("Teiler: ");
		
		while (teiler > 1) {
			if (zahl % teiler == 0) {
				System.out.print(teiler + " ");
			}
			teiler--;
		}
		System.out.print(1);
	}
}
