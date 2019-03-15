package fr.aberwag.personnages;

public class Main {

	public static void main(String[] args) {
		System.out.println("GNOME");
		Gnome gn = new Gnome("Gnome", 3, "GN1", "A13", 123);
		gn.manger();
		gn.sauter();
		gn.attack();

		System.out.println("================");
		System.out.println("TROLL");
		Troll tr = new Troll("TROLL", 2, "TR1", "T23", 60);
		tr.saCacher();
		tr.manger();
		tr.attack();

		Elf elf = new Elf("ELF", 2, "ELF34", "RTS3", 12);
		elf.attack();

		System.out.println("=================");
		System.out.println("Magicien");
		Mage mg = new Mage("Magicien", 5, "MG1", "Feu", 1500);

		mg.manger();
		mg.sauter();
		mg.attack();
		mg.voler();

		Personnage p = null;
		int i = 1;
		if (i == 1) {
			p = new Gnome("Gnome", 3, "GN1", "A13", 123);
		}

		p.attack();

	}

}
