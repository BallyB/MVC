package mvc;

import java.util.Observable;

public class Modele extends Observable{

	
		public int entier;
		public Modele(){
			
			
		}
		
		public int getEntier() {
			return entier;
		}
		public void setEntier(int entier) {
			this.entier = entier;
			this.setChanged();
			this.notifyObservers();
		}

		public int getMin() {
			// TODO Auto-generated method stub
			return 0;
		}

		public int getMax() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
		
		
}
