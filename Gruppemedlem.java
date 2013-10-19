/*
 * Oblig 3 (DAPE1400) - forfattet av følgende
 * studenter fra Anvendt datateknologi, 2. året:
 * 
 * Vegar Norman <s189153@stud.hioa.no> 
 * Per Erik Finstad <s189138@stud.hioa.no>
 * Even Holthe <s189124@stud.hioa.no>
 */
public class Gruppemedlem {
	// Datafelt
	private String navn;
	private String klasse;

	// Konstruktør
	public Gruppemedlem (String navn, String klasse){
		this.navn   = navn;
		this.klasse = klasse;
	}

	// Returnerer navnet
	public String getNavn(){
		return this.navn;
	}

	// Returnerer klassen
	public String getKlasse(){
		return this.klasse;
	}
}
