package Tema5;

public class Iepuras extends Animal {

	public Iepuras() {
		
	}

	public Iepuras(String tipAnimal) {
		super(tipAnimal);
		
	}

	public Iepuras(String tipAnimal, String culoare, int varsta) {
		super(tipAnimal, culoare, varsta);
		
	}
			
		public String afiseazaDetalii() {
		return "Animalul iepuras "+ gettipAnimal()+ " are o blana de culoare "+ getculoare()+ " si varsta de "+ getvarsta() + " luni";
	}

}
