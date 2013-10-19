/*
 * Oblig 3 (DAPE1400) - forfattet av følgende
 * studenter fra Anvendt datateknologi, 2. året:
 * 
 * Vegar Norman <s189153@stud.hioa.no> 
 * Per Erik Finstad <s189138@stud.hioa.no>
 * Even Holthe <s189124@stud.hioa.no>
 */
public class Oblig {
	// Datafelt
	private Gruppemedlem[] gruppe;
	private int obligNr;
	boolean godkjent;

	// Konstruktør
	public Oblig(Gruppemedlem[] gruppe, int obligNr, boolean godkjent){
		this.gruppe   = gruppe;
		this.obligNr  = obligNr;
		this.godkjent = godkjent;
	}

	public Gruppemedlem[] getDeltakere(){
		return gruppe;
	}

	public int getObligNr(){
		return obligNr;
	}

	public boolean getGodkjent(){
		return godkjent;
	}
}
