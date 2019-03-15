package fr.aberwag.personnages;

public class Troll extends Personnage{

	public Troll() {
		super();
	}

	public Troll(String nom, int nombreDeVies, String type, String arme, int puissance) {
		super(nom, nombreDeVies, type, arme, puissance);
	}

	@Override
	public void attack() {
		System.out.println("Attack de Troll");
	}
	
}
