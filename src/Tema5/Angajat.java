package Tema5;

public class Angajat extends Persoana {
       private Sef angajator;
       
       public Angajat() {
    	 super();
    	 
    	 angajator = new Sef();
    	 
       }
    	
       public Angajat(String nume) {
    	  super(nume);
    	  angajator = new Sef();
    	  
       }
       public Angajat(String nume, String prenume, int varsta) {
    	   super(nume, prenume, varsta);
    	   angajator = new Sef();  
       }
       public Sef getAngajator() {
    	   return angajator;}
    	  	 
    	   
    	public void setAngajator(Sef angajator) {
    		this.angajator = angajator;
    		
    	}   
          
       }
    	 
    	   
    	   
    	   
       

