package Tema5;



public class Apartament extends Imobil {

	public Apartament() {
		
	}

	public Apartament(String tipCasa) {
		super(tipCasa);
		
	}

	public Apartament(String tipCasa, int nrEtaje, double pret) {
		super(tipCasa, nrEtaje, pret);
		
	}
	public String afiseazaDetalii() {
		return "Apartament "+ gettipCasa()+ " cu "+ getnrEtaje()+ " etaje "+ "are pretul de " + getpret();
}
}