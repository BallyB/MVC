package mvc;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

public class VueEntree extends Observable implements Observer, ActionListener{

	

	public JTextField champ;
	public VueEntree(){
		this.champ = new JTextField();
		this.champ.setText("40");
		this.champ.setFont(new Font("Times New Roman", Font.BOLD, 24));
		this.champ.setColumns(10);
		this.champ.addActionListener(this);

	}

	public JTextField getChamp() {
		return champ;
	}

	public void setChamp(JTextField champ) {
		this.champ = champ;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		champ.setText(Integer.toString((Integer)arg));

	}
	
	public void actionPerformed(ActionEvent e) {
		this.setChanged();
		this.notifyObservers(champ.getText());
	} 

	
}
