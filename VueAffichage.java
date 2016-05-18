package mvc;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VueAffichage implements Observer {

	
	private JLabel jl;
	
	
	public VueAffichage(){
		
		this.jl = new JLabel("40");
		this.jl.setHorizontalAlignment(SwingConstants.CENTER);
		this.jl.setFont(new Font("Times New Roman", Font.BOLD, 24));
		

	}
	
	public JLabel getContenu() { 
		return jl;
	}
	

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		this.jl.setText(Integer.toString((Integer)arg1));
	}
	

}
