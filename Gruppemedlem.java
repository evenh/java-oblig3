/*
 * Even Holthe (s189124) <even.holthe@me.com>
 * Oblig 3 (DAPE1400) av s189124, s189153 og s189138
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
