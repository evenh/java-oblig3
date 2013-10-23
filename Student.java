/*
 * Oblig 3 (DAPE1400) - forfattet av følgende
 * studenter fra Anvendt datateknologi, 2. året:
 * 
 * Vegar Norman <s189153@stud.hioa.no> 
 * Per Erik Finstad <s189138@stud.hioa.no>
 * Even Holthe <s189124@stud.hioa.no>
 */
public class Student {
	// Datafelter
	private String navn;
	private String klasse;
	private Oblig[] levert;

	// Konstruktør
	public Student(String navn, String klasse, int antObliger){
		this.navn   = navn;
		this.klasse = klasse;
		this.levert = new Oblig[antObliger];
	}

	private int erRegistrert(int nr) {
		int resultat = -1;

		for (int i = 0; i < this.levert.length; i++) {
			if (this.levert[i].getObligNr() == nr) {
				resultat = i;
				break;
			}
		}

		return resultat;
	}

	public void innlevering(Oblig oppg){
	}

	public int ikkeGodkjent() {
		int resultat = 0;

		for (Oblig leveranse : this.levert) {
			if (leveranse.getGodkjent() == false) {
				resultat++;
			}
		}

		return resultat;
	}

	public String toString() {
		int manglende = 0;
		String output = "";

		output += "Navn: " + this.navn + "\n";
		output += "Klasse: " + this.klasse + "\n";

		for (int i = 0; i < this.levert.length; i++) {
			String status = "";

			if (this.levert[i].getGodkjent()) {
				status = "godkjent";
			}

			else {
				status = "ikke godkjent";
				manglende++;
			}

			output += "Obligatorisk oppgave nr. " + this.levert[i].getObligNr() + " er " + status + "\n";
		}

		if (manglende > 0) {
			output += navn + " kan ikke gå opp til eksamen.";
		}

		else {
			output += navn + " kan gå opp til eksamen.";
		}

		return output;

	}

}
