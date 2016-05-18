package mvc;

import java.util.Observable;

public class Controleur extends Observable{
	
	private Modele modele;
	private ObserverModele obsM; 
	private ObserverVue obsV;
	
	public Controleur(Modele m)
	{
		modele = m; 
		obsM = new ObserverModele(this);
		obsV = new ObserverVue(this);
	}
	
	public void updateModele(Observable o, Object arg) 
	{
		this.setChanged();
		this.notifyObservers(arg);
	}
	
	public int getMax() { 
		return modele.getMax();
	}
	
	public int getMin() {
		return modele.getMin();
	}

	public ObserverModele getObsM() {
		return obsM;
	}

	public void setObsM(ObserverModele obsM) {
		this.obsM = obsM;
	}

	public ObserverVue getObsV() {
		return obsV;
	}

	public void setObsV(ObserverVue obsV) {
		this.obsV = obsV;
	}

	public void updateVue(Observable o, Object arg) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt((String)arg);
		this.modele.setEntier(i);
		this.setChanged();
		this.notifyObservers(i);
			

	}


}
