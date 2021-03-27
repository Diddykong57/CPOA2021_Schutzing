package td1.modele;

import java.util.Observable;

public class Bilan extends Observable {
	
	public Bilan() {
		super();
		System.out.println("Dans constructeur bilan");
	}
	
	public void setChanges() {
		System.out.println("Dans methode setChanges(), le bilan est à jour...");
		this.notify1();
	}
	
	
}
