package mvc;

import java.util.Observable;
import java.util.Observer;

public class ObserverVue implements Observer{
	private Controleur c;
	
	public ObserverVue(Controleur c)
	{
		this.c = c;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.c.updateVue(o, arg);
	}

}
