import Prog1Tools.IOTools;
public class P8_Primfaktoren {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primzahlen1 = new int[1000];
		int[] primzahlen2 = new int[1000];
		int[] primfaktoren1 = new int[1000];
		int[] primfaktoren2 = new int[1000];
		int ganzzahl1;
		int ganzzahl2;
		int ggT;
		
		ganzzahl1 = IOTools.readInt("Bitte geben Sie die erste Ganzzahl ein: ");
		ganzzahl2 = IOTools.readInt("Bitte geben Sie die zweite Ganzzahl ein: ");
		primzahlen1 = getPrimzahlen(ganzzahl1);
		primzahlen2 = getPrimzahlen(ganzzahl2);
		primfaktoren1 = getPrimfaktoren(primzahlen1, ganzzahl1);
		primfaktoren2 = getPrimfaktoren(primzahlen2, ganzzahl2);	
		System.out.println("Primfaktoren von "+ganzzahl1+":");
		arrayausgeben(primfaktoren1);
		System.out.println("Primfaktoren von "+ganzzahl2+":");
		arrayausgeben(primfaktoren2);
		ggT = getggT(primfaktoren1, primfaktoren2);
		System.out.println("ggT: "+ggT);
	}

	static int getggT(int[] primfaktorenzahl1,int[] primfaktorenzahl2)
	{
		int[] gemeinsamePrimfaktoren = new int[1000];
		int ggT;
		int i,j,k;
				
		k = 0;
		for(i=0;i<primfaktorenzahl1.length;i++)
		{
			
			if(primfaktorenzahl1[i] != 0)
			{
				;
				for(j=0; j < primfaktorenzahl2.length;j++)
				{
					if(primfaktorenzahl2[i] != 0)
					{
						if(primfaktorenzahl2[j] == primfaktorenzahl1[i]) 
						{

							gemeinsamePrimfaktoren[k] = primfaktorenzahl2[j];
							primfaktorenzahl1[i] = primfaktorenzahl2[j] = 0;
							k++;
						}
					}

				}
			}
		}
		ggT = 1;
		//arrayausgeben(gemeinsamePrimfaktoren);

		for(i=0;i < gemeinsamePrimfaktoren.length;i++)
		{
			if(gemeinsamePrimfaktoren[i] != 0)
			{
			  ggT *= gemeinsamePrimfaktoren[i];
			}
		}
		return ggT;
	}
	
	static int[] getPrimfaktoren(int[] primzahlen,int ganzzahl)
	{
		int[] primfaktoren = new int[1000];
		int i;
		int j;
		
		for(i=0,j=0; i<primzahlen.length && !isPrimzahl(primzahlen,ganzzahl);) {
			if(primzahlen[i] != 0)
			{
			  if(ganzzahl%primzahlen[i] == 0)
			  {
				  primfaktoren[j] = primzahlen[i];
				  ganzzahl = ganzzahl/primzahlen[i];
				  j++;
				  i=0;	  
			  } else {
				  i++;
			  }
			}
		}
		primfaktoren[j] = ganzzahl;
		return primfaktoren;
	}
	
	static Boolean isPrimzahl(int[] primzahlen, int ganzzahl)
	{
		int i;
		for(i=0;i<primzahlen.length;i++)
		{
			if(ganzzahl == primzahlen[i])
			{
				return true;
			}
		}
		return false;
	}
	
	static int[] getPrimzahlen(int intervall)
	{
		int[] primzahlen = new int[1000];
	    boolean[] gestrichen;
		int i, j, z;

		gestrichen = new boolean[intervall + 1]; //Felder von Boolean-Arrays sind standardmaessig mit false initialisiert

		for (i = 2; i * i <= intervall; i++) {
			if (!gestrichen[i]) {
				for (j = i * i; j <= intervall; j += i) {
					gestrichen[j] = true;
				}
			}
		}
		
		for (i = 2, z = 0; i <= intervall; i++) {
			if (!gestrichen[i]) {
				primzahlen[z] = i;
				z++;
			}
		}
		return primzahlen;

	}
	
	/*
	 * for testing purposes
	 */
	static void arrayausgeben(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i] != 0)
			{
				System.out.println(array[i]);	
			}
		}
	}
}
