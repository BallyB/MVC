package mvc;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

public class VueEntree extends Observable implements Observer{

	

	public JTextField champ;
	public VueEntree(){
		this.champ = new JTextField();
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	
}
