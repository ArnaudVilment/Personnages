package fr.aberwag.personnages;

public class Guerrier extends Personnage {

	public Guerrier() {
		super();
	}

	public Guerrier(String nom, int nombreDeVies, String type, String arme, int puissance) {
		super(nom, nombreDeVies, type, arme, puissance);
	}

	@Override
	public void attack() {
		System.out.println("Attack de guerrier");
	}

}
