package fr.aberwag.personnages;

public class Gnome extends Personnage{

	public Gnome() {
		super();
	}

	public Gnome(String nom, int nombreDeVies, String type, String arme, int puissance) {
		super(nom, nombreDeVies, type, arme, puissance);
	}

	@Override
	public void attack() {
		System.out.println("Attack de Gnome");
	}

}
