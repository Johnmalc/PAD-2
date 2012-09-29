/*

Aufgabe 7:

Schreiben Sie ein Programm, das Zinseszinsen berechnet:
Kapital nach n Perioden = Kapital nach n-1 Perioden + Zins.
Die Zinseszinsrechnung soll in einer Methode/Funktion durchgeführt werden.
Erstellen Sie zwei Varianten: rekursiv und iterativ.
Bei der Zinsrechnung soll auf Cent abgerundet werden, realisieren Sie das mit einer weiteren Funktion.

Was ist günstiger: 4,5% vierteljährlich verzinst oder 5% jährlich?

*/

import  Prog1Tools.*;
public class P7_Zinseszins {

	public static void main(String[] args) {
		double betrag;
		double zinssatz;
		int perioden;
		
		double endkapital;
		
		do
		{
			betrag = IOTools.readDouble("Bitte Betrag eingeben: ");	
		} while(betrag <= 0);
		do
		{
			zinssatz = IOTools.readDouble("Bitte Zinssatz eingeben: ");	
		} while(zinssatz <= 0);
		do
		{
			perioden = IOTools.readInt("Bitte Anzahl der Perioden eingeben: ");	
		} while(perioden <= 0);	
		
		endkapital = berechneZinseszinsenIterativ(betrag,zinssatz,perioden);
		System.out.println("Iterativ: "+endkapital);
		endkapital = berechneZinseszinsenRekursiv(betrag,zinssatz,perioden);
		System.out.println("Rekursiv: "+endkapital);
		endkapital = berechneZinseszinsenIterativ(1000.,4.5,3);
		System.out.println("vierteljaehrlich mit 4,5%: "+endkapital);
		endkapital = berechneZinseszinsenIterativ(1000.,5,1);
		System.out.println("jaehrlich mit 5%: "+endkapital);
	}

	private static double berechneZinseszinsenRekursiv(double betrag, double zinssatz,int perioden) {
		//Abbruchbedingung
		if(perioden < 1)
		{
			return betrag;
		} else {
			betrag = berechneZinseszinsenRekursiv(betrag,zinssatz,perioden-1);
			betrag *= 1.+zinssatz/100;		
			return abschneiden(betrag);
		}
	}
	
	private static double berechneZinseszinsenIterativ(double betrag, double zinssatz,int perioden)
	{
		for(;perioden > 0;perioden--)
		{
			betrag*= 1.+zinssatz/100;
			betrag = abschneiden(betrag);
		}
		return betrag;
	}
	
	private static double abschneiden(double betrag)
	{
	  return((int) (betrag*100))/100.;
	}
}