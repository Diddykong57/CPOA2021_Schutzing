package td1.vue;

import td1.miscs.Observable;
import td1.interfaces.IObserver;

public class UIGraphe implements IObserver {
	
	private int num;
		
	public int getNum(){
		return num;
	}
	
	public UIGraphe(int num) {
		this.num = num;
	}
	
	@Override
	public void update(Observable obj) {
		System.out.println("dans methode update()");
	}
}
