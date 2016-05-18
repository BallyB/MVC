package mvc;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Vue extends JFrame{

	private VueAffichage vA;
	private VueEntree vE;
	private VueProgressBar vPB;
	
	public Vue(){
		
		vA = new VueAffichage();
		vE = new VueEntree();
		vPB = new VueProgressBar();
		
		add(vA.getContenu(),BorderLayout.CENTER);
		add(vE.getChamp(), BorderLayout.NORTH);
		
		
		
		
	}
	
	
	
	
}
