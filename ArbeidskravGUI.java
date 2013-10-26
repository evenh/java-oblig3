import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class ArbeidskravGUI extends JFrame implements ActionListener {


	// Attributter
	//============

	private JTextField 		person,
							obligNr,
							kl;

	private JTextField[] 	navn,
						 	klasse;

	private JButton 		reg,
						 	sjekk,
						 	status;

	private JTextArea 		output;

	private ObligRegister 	kartotek;

	private JCheckBox 		godkjent;


	// Konstruktør
	//============

	public ArbeidskravGUI(String fag, int antStudenter, int antObliger, int antPrGruppe) {

		// Konstruktør arvet fra JFrame
		super (fag + " - Arbeidskrav");

		// Opprett nytt ObligRegistert basert på informasjon fra konstruktør
		this.kartotek = new ObligRegister(antStudenter, antObliger);

		// Opprett JTextField-objekter
		this.person = new JTextField(10);
		this.kl = new JTextField(10);
		this.obligNr = new JTextField(1);

		// Opprett JTextField[]-arrayer
		this.navn = new JTextField[antPrGruppe];
		this.klasse = new JTextField[antPrGruppe];

		// Fyll JTextField[]-arrayer med JTextField-objekter
		for (int i = 0; i < this.navn.length; i++) {
			navn[i] = new JTextField(20);
			klasse[i] = new JTextField(5);
		}

		// Opprett JButton, JCheckBox og JTextArea-objekter
		this.reg = new JButton("Innlevering");
		this.sjekk = new JButton("Sjekk godkjenning for student: ");
		this.status = new JButton("Liste over godkjente i klasse: ");
		this.godkjent = new JCheckBox("Godkjent");
		this.output = new JTextArea(35, 35);

		// Lag lyttere til JButton-objektene
		this.reg.addActionListener(this);
		this.sjekk.addActionListener(this);
		this.status.addActionListener(this);

		// Lag en Container med FlowLayout
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// Legg alle objekter i JTextField[]-arrayene til Containeren
		for (int i = 0; i < this.navn.length; i++) {
			c.add(new JLabel("Navn: "));
			c.add(navn[i]);
			c.add(new JLabel("Klasse: "));
			c.add(klasse[i]);
		}

		// Legg alle andre objekter til Containeren
		c.add(new JLabel("Obligatorisk oppgave nr: "));
		c.add(this.obligNr);
		c.add(this.godkjent);
		c.add(this.reg);
		c.add(this.sjekk);
		c.add(this.person);
		c.add(this.status);
		c.add(this.kl);
		c.add(new JScrollPane(output));

		// Innstillinger for JFrame
		setSize(420, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	private Gruppemedlem[] lesGruppe() {
		
	}

	public void registrer() {

	}

	public void sjekkGodkjenning() {

	}

	public void skrivListe() {

	}

	public void actionPerformed(ActionEvent e) {

	}

}