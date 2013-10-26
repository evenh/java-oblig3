/*
 * Oblig 3 (DAPE1400) - forfattet av følgende
 * studenter fra Anvendt datateknologi, 2. året:
 * 
 * Vegar Norman <s189153@stud.hioa.no> 
 * Per Erik Finstad <s189138@stud.hioa.no>
 * Even Holthe <s189124@stud.hioa.no>
 */

import java.util.ArrayList;

public class ObligRegister{
	private ArrayList<Student> studenter;
	private int antallObliger;

	// Konstruktør
	public ObligRegister(int antStud, int antOblig){
		this.studenter = new ArrayList<Student>();
		this.antallObliger = antOblig;
	}

	public void nyStudent(Student ny) {
		studenter.add(ny);
	}


	public void registrer(Oblig oppg) {
		for (int i = 0; i < oppg.getDeltakere().length; i++) {
			String navn = oppg.getDeltakere()[i].getNavn();
			boolean finnes = false;

			for (Student s: studenter) {
				if (s.getNavn() == navn) {
					s.innlevering(oppg);
					finnes = true;
				}
			}

			if (!finnes) {
				Student ny = new Student(oppg.getDeltakere()[i].getNavn(), oppg.getDeltakere()[i].getKlasse(), this.antallObliger);
				this.studenter.add(ny);
				ny.innlevering(oppg);
			}
		}
	}

	public String godkjent(String navn) {
		for (Student s : studenter) {
			if (s.getNavn() == navn) {
				return s.toString();
			}
		}

		return "Ingen data funnet.";
	}

}
