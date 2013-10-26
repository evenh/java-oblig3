/*
 * Oblig 3 (DAPE1400) - forfattet av følgende
 * studenter fra Anvendt datateknologi, 2. året:
 * 
 * Vegar Norman <s189153@stud.hioa.no> 
 * Per Erik Finstad <s189138@stud.hioa.no>
 * Even Holthe <s189124@stud.hioa.no>
 */

import javax.swing.*;

public class Student {
	// Datafelter
	private String navn;
	private String klasse;
	private Oblig[] levert;
	private int antallObliger;

	// Konstruktør
	public Student(String navn, String klasse, int antObliger){
		this.navn          = navn;
		this.klasse        = klasse;
		this.antallObliger = antObliger;
		this.levert        = new Oblig[antObliger];
	}

	// Utvidelse på eget initiativ:
	// Andre klasser kan ikke sjekke på navn eller klasse når scope er satt til private.
	// Laget derfor getters for disse.

	public String getNavn() {
		return this.navn;
	}

	public String getKlasse() {
		return this.klasse;
	}

	private int erRegistrert(int nr) {
		for(int i=0;i<this.levert.length;i++){
			if( (this.levert[i] != null) && (this.levert[i].getObligNr() == nr) ){
				return i;
			}
		}
		return -1;
	}

	public void innlevering(Oblig oppg){
		// Hvis levert tidligere
		if((this.erRegistrert(oppg.getObligNr()) != -1)){
			// Erstatt oppgaven hvis den ikke var godkjent
			int obligNr = this.erRegistrert(oppg.getObligNr());
			if(!this.levert[obligNr].getGodkjent()){
				this.levert[obligNr] = oppg;
			}
		// Den har ikke vært levert tidligere, lever
		} else {
			// Finn ut hvilken plass vi skal lagre på
			int teller = 0;
			for(int i=0;i<this.levert.length;i++){
				if(this.levert[i] != null){
					teller++;
				}
			}
			// Lagre
			if(teller > this.levert.length-1){
				JOptionPane.showMessageDialog(null, "Du kan ikke levere en oblig som ikke eksisterer!", "Feil!", JOptionPane.ERROR_MESSAGE);
			} else {
				this.levert[teller] = oppg;	
			}
			
		}
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
		int sjekket   = 0;
		String output = "";

		output += "Navn: " + this.navn + "\n";
		output += "Klasse: " + this.klasse + "\n";

		for (int i = 0; i < this.levert.length; i++) {
			String status = "";

			if(this.levert[i] != null){
				if (this.levert[i].getGodkjent()) {
					status = "godkjent";
				} else {
					status = "ikke godkjent";
					manglende++;
				}
				output += "Obligatorisk oppgave nr. " + this.levert[i].getObligNr() + " er " + status + "\n";
				sjekket++;
			} 
			
		}

		if (manglende > 0) {
			output += navn + " kan ikke gå opp til eksamen. Mangler " + manglende + " oppgaver for å gå opp.";
		} else if(manglende == 0 && this.antallObliger > sjekket){
			output += navn + " mangler "+(this.antallObliger-sjekket)+" obliger, men er på god vei...";
		} else {
			output += navn + " kan gå opp til eksamen.";
		}

		return output+"\n\n";

	}

}
