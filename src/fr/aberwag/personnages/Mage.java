package fr.aberwag.personnages;

public class Mage extends Personnage implements Voler{

	@Override
	public void attack() {
		System.out.println("Attack de Magicien");
	}

	@Override
	public void voler() {
		System.out.println("Je suis un  magicien qui vole");		
	}
	
	
	public Mage() {
		super();
	}

	public Mage(String nom, int nombreDeVies, String type, String arme, int puissance) {
		super(nom, nombreDeVies, type, arme, puissance);
	}


}
