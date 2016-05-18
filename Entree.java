package mvc;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;

class Entree {
	private JFrame fenetre;
	private VueAffichage vA;
	private VueProgressBar vPB;
	private VueEntree vE;

	public Entree() {
		this.fenetre = new JFrame();
		this.fenetre.setBounds(100, 100, 450, 300);
		this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.fenetre.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		this.vA = new VueAffichage();
		this.vPB = new VueProgressBar();
		this.vE = new VueEntree();
		this.fenetre.getContentPane().add(this.vE.getChamp());
		this.fenetre.getContentPane().add(this.vA.getContenu());
		this.fenetre.getContentPane().add(this.vPB.getBarre());
	}

	public static void main(String[] args) {
		Modele modele = new Modele();
		Controleur controleur = new Controleur(modele);
		Entree en = new Entree();

		modele.addObserver(controleur.getObsM());

		en.vE.addObserver(controleur.getObsV());
		
		controleur.addObserver(en.vE);

		controleur.addObserver(en.vA);

		controleur.addObserver(en.vPB);


		modele.notifyObservers(modele.getEntier());
		en.fenetre.setVisible(true);


}
}