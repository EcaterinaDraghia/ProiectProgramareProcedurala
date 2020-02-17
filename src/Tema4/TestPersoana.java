package Tema4;

public class TestPersoana {
	public static void main(String[] args) {
	    Persoana pers = new Persoana();
	    	
	    	pers.setNume("Pop");
	    	pers.setPrenume("Pip");
	    	pers.setVarsta(10);
	    	
	    	System.out.println("Nume: " + pers.getNume() + "\nPrenume: " + pers.getPrenume() + "\nVarsta: " + pers.getVarsta());
	    	
	    	System.out.println();
	    	
	    	Persoana pers2 = new Persoana();
	    	//setam nume,prenume,varsta
	    	pers2.setNume("Ana");
	    	pers2.setPrenume("Maria");
	    	pers2.setVarsta(17);
	    	
	    	//retragem nume,prenume si varsta
	    	System.out.println("Nume: " + pers2.getNume() + "\nPrenume: " + pers2.getPrenume() + "\nVarsta: " + pers2.getVarsta());
	          
	       }

}
