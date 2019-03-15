package fr.aberwag.personnages;

public class Elf extends  Personnage {

	public Elf() {
		super();
	}

	public Elf(String nom, int nombreDeVies, String type, String arme, int puissance) {
		super(nom, nombreDeVies, type, arme, puissance);
	}

	@Override
	public void attack() {
		System.out.println("Attack ELFF");
	}

}
