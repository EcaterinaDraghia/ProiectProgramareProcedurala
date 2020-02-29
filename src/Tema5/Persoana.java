package Tema5;

public class Persoana {
	private String nume;
 	private String prenume;
 	private int varsta;
 	 public Persoana() 
     { nume = "";
	   prenume = "";
	   varsta = 0;
     }
	   
     public Persoana(String nume)
     {
  	 this.nume = nume;
	 this.prenume = "";
	 this.varsta = 0;
     }
     
     public Persoana(String nume, String prenume, int varsta)
     {
  	 this.nume = nume;
  	 this.prenume = prenume;
  	 this.varsta = varsta;
       } 

     public String getnume() 
     {
       return nume;
     }
     
     public String setnume(String nume)
     {
  	return this.nume = nume;  
     }  
     
     public String getprenume() 
     {
       return prenume;
     }
     
     public String setprenume(String prenume)
     {
  	return this.prenume = prenume;  
     }
     
     public int getvarsta() 
     {
       return varsta;
     }
     
     public int setvarsta(int varsta)
     {
  	return this.varsta = varsta;  
     }
     
 	    public String afiseazaDetalii() {
		return "Persoana cu numele "+ nume + " cu culoarea "+ prenume + " si varsta "+ varsta;
 	    }

    	
     
}  
