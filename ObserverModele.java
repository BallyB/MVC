package mvc;

import java.util.Observable;
import java.util.Observer;

public class ObserverModele implements Observer
{
	private Controleur c;
	
	
	public ObserverModele(Controleur c)
	{
		this.c = c;
	}


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.c.updateModele(o, arg);
	}

}
