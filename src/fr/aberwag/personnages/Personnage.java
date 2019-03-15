package fr.aberwag.personnages;

public abstract class Personnage {
	
	protected String nom ;
	protected int nombreDeVies;
	protected String type;
	protected String arme ;
	protected int puissance;
	
	public Personnage() {
		super();
	}

	public Personnage(String nom, int nombreDeVies, String type, String arme, int puissance) {
		super();
		this.nom = nom;
		this.nombreDeVies = nombreDeVies;
		this.type = type;
		this.arme = arme;
		this.puissance = puissance;
	}
	
	public abstract void attack();
	
	public void manger() {
		System.out.println("Miam miam");
	}
	
	public void sauter() {
		System.out.println("Je saute ");
	}
	
	public void saCacher() {
		System.out.println("Je suis bien caché");
	}
	
	public void changerArme(String nouvelleArme) {
		System.out.println("Je change d'arme");
		arme = nouvelleArme;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nombreDeVies
	 */
	public int getNombreDeVies() {
		return nombreDeVies;
	}

	/**
	 * @param nombreDeVies the nombreDeVies to set
	 */
	public void setNombreDeVies(int nombreDeVies) {
		this.nombreDeVies = nombreDeVies;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the arme
	 */
	public String getArme() {
		return arme;
	}

	/**
	 * @param arme the arme to set
	 */
	public void setArme(String arme) {
		this.arme = arme;
	}

	/**
	 * @return the puissance
	 */
	public int getPuissance() {
		return puissance;
	}

	/**
	 * @param puissance the puissance to set
	 */
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
}
