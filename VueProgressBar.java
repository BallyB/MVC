package mvc;
import java.awt.Component;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JProgressBar;

public class VueProgressBar implements Observer {

	private JProgressBar barre;
	
	public VueProgressBar(){
		barre = new JProgressBar();
		barre.setStringPainted(true);
		barre.setValue(40);	
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		barre.setMaximum(((Controleur)o).getMax());
		barre.setMinimum(((Controleur)o).getMin());
		barre.setValue((Integer)arg);

	}

	public Component getBarre() {
		// TODO Auto-generated method stub
		return this.barre;
	}
}
