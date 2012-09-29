
public class P9_Bruch {

	private int zaehler,nenner;
	
	/* Konstruktor */
	public P9_Bruch(int zaehler, int nenner)
	{
		if(nenner != 0)
		{
			this.zaehler = zaehler;
			this.nenner = nenner;
			kuerzen();
		}
		else
		{
			System.out.println("Division durch Null nicht moeglich.");
		}
	}
	
	public P9_Bruch multiplizieren(P9_Bruch bruch2)
	{
		int neuerZaehler;
		int neuerNenner;
		
		neuerZaehler = zaehler*bruch2.zaehler;
		neuerNenner = nenner*bruch2.nenner;
		
		return new P9_Bruch(neuerZaehler,neuerNenner);
	}
	
	public int getggT()
	{
		int zahl1 = zaehler;
		int zahl2 = nenner;
		int rest = Integer.MAX_VALUE;
		
		while(rest != 0)
		{
			rest = zahl1%zahl2;
			zahl1 = zahl2;
			zahl2 = rest;
		}
		return zahl1;
	}
	
	public void kuerzen()
	{
		int ggT = getggT();
		if(ggT != 1)
		{
			zaehler /= ggT;
			nenner /= ggT;
		}
	}
	
	public String toString()
	{
		return (nenner == 1) ? ""+zaehler : (zaehler+"/"+nenner);
	}
}
