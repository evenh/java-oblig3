import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ArbeidskravGUI extends JFrame implements ActionListener {

	private JTextField 	person,
							 	obligNr,
							 	kl;

	private JTextField[] navn,
								klasse;

	private JButton 		reg,
						 		sjekk,
						 		status;

	private JTextArea 	output;

	private ObligRegister kartotek;

	private JCheckBox 	godkjent;



	public ArbeidskravGUI(String fag, int antStudenter, int antObliger, int antPrGruppe) {

		super (fag + " - Arbeidskrav");

		this.kartotek = new ObligRegister(antStudenter, antObliger);

		this.person = new JTextField(10);
		this.kl = new JTextField(10);
		this.obligNr = new JTextField(1);

		this.navn = new JTextField[antPrGruppe];
		this.klasse = new JTextField[antPrGruppe];

		for (int i = 0; i < this.navn.length; i++) {
			navn[i] = new JTextField(20);
			klasse[i] = new JTextField(5);
		}

		this.reg = new JButton("Innlevering");
		this.sjekk = new JButton("Sjekk godkjenning for student: ");
		this.status = new JButton("Liste over godkjente i klasse: ");
		this.godkjent = new JCheckBox("Godkjent");
		this.output = new JTextArea(35, 35);

		this.reg.addActionListener(this);
		this.sjekk.addActionListener(this);
		this.status.addActionListener(this);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		for (int i = 0; i < this.navn.length; i++) {
			c.add(new JLabel("Navn: "));
			c.add(navn[i]);
			c.add(new JLabel("Klasse: "));
			c.add(klasse[i]);
		}

		c.add(new JLabel("Obligatorisk oppgave nr: "));
		c.add(this.obligNr);
		c.add(this.godkjent);
		c.add(this.reg);
		c.add(this.sjekk);
		c.add(this.person);
		c.add(this.status);
		c.add(this.kl);
		c.add(new JScrollPane(output));

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