import Prog1Tools.IOTools;
public class P5_Teiler_Zweierpotenz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl = 2;
		int exponent,teiler;
		
		exponent = IOTools.readInt("Bitte Exponent eingeben: ");

		//Zur Kontrolle zahl = (int)Math.pow((double) 2,(double) exponent)-1;
		
		for(int i = 0; i<(exponent-1); i++)
		{
			zahl*=2;
		}
		
		zahl-=1;
		
		System.out.println("(2^"+exponent+")-1 = "+zahl);
		
		teiler = (zahl%2 == 0) ? (zahl/2)-1:(zahl/2);
		
		System.out.print("Teiler: ");
		
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
