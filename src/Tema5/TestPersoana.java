package Tema5;

public class TestPersoana {
	public static void main(String[] args) {
	    Sef angajator1 = new Sef();
	    	
	    	angajator1.setnume("Popescu");
	    	angajator1.setprenume("Iulian");
	    	angajator1.setvarsta(10);
	    	
	    // declarare si initializare variabila de tip Angajat	
	    	
	    Angajat angajat1 = new Angajat("Mrs","Carina",25);
	    angajat1.setAngajator(angajator1); // setare Sef pentru obiectul Angajat
	    
	    //Afisare informatii in consola despre angajat si angajator
	    	
	    System.out.println("Angajatul: " + angajat1.getnume() + " " + angajat1.getprenume() + " are ca sef pe " +angajator1.getnume()
	    + " " + angajator1.getprenume());
	}
}
	    	
	

