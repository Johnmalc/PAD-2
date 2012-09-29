import Prog1Tools.IOTools;

public class P5_Teiler_For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl,teiler = 0;
		
		zahl = IOTools.readInt("Bitte Zahl eingeben: ");
		System.out.print("Teiler: ");
		
		teiler = (zahl%2 == 0) ? (zahl/2)-1:(zahl/2);
		
		for(;teiler>1;teiler--)
		{
			if(zahl%teiler == 0)
			{
				System.out.print(teiler+" ");
			}
		}
		System.out.print(1);
	}
}
