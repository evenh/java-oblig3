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

}
