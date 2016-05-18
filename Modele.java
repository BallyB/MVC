package mvc;

import java.util.Observable;

public class Modele extends Observable{

	
		public int entier;
		public int min = 0;
		public int max = 100;
		public Modele(){
			
			
		}
		
		public int getEntier() {
			return entier;
		}
		public void setEntier(int entier) {
			this.entier = entier;
		//	this.setChanged();
		//	this.notifyObservers();
		}

		public int getMin() {
			// TODO Auto-generated method stub
			return min;
		}

		public int getMax() {
			// TODO Auto-generated method stub
			return max;
		}
		
		
		
		
		
}
