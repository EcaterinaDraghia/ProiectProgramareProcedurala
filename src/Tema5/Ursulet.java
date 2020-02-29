package Tema5;

public class Ursulet extends Animal {

	public Ursulet() {
		
	}

	public Ursulet(String tipAnimal) {
		super(tipAnimal);
		
	}

	public Ursulet(String tipAnimal, String culoare, int varsta) {
		super(tipAnimal, culoare, varsta);
	
	}

	public String afiseazaDetalii() {
		return "Animalul ursulet "+ gettipAnimal()+ " are o blana de culoare "+ getculoare()+ " si varsta de "+ getvarsta() + " luni";
	}
}
