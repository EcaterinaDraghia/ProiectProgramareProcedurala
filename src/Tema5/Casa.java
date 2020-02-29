package Tema5;

public class Casa extends Imobil {

	public Casa() {
		
	}

	public Casa(String tipCasa) {
		super(tipCasa);
		
	}

	public Casa(String tipCasa, int nrEtaje, double pret) {
		super(tipCasa, nrEtaje, pret);
		
	}
	public String afiseazaDetalii() {
		return "Casa "+ gettipCasa()+ " cu "+ getnrEtaje()+ " etaje "+ " are pretul de " + getpret();
}
}