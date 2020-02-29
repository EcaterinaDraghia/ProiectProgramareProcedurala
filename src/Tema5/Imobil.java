package Tema5;

public class Imobil {
       private String tipCasa;
       private int nrEtaje;
       private double pret;
       
       public Imobil()
       { 
    	 tipCasa="";
         nrEtaje = 0;
         pret = 0;
       }
    
       public Imobil(String tipCasa)
       {  
    	  this.tipCasa = tipCasa;
          this.nrEtaje = 0;
          this.pret = 0;  
       }
       
       public Imobil(String tipCasa, int nrEtaje, double pret)
       { 
    	  this.tipCasa = tipCasa;
          this.nrEtaje = nrEtaje;
          this.pret = pret;    
       }

       public String gettipCasa()
       {  
    	  return tipCasa;
       }
      
       public String settipCasa(String tipCasa)
       {
    	  return this.tipCasa = tipCasa;  
       }  

       public int getnrEtaje()
       {  
    	  return nrEtaje;
       }
      
       public int setnrEtaje(int nrEtaje)
       {
    	  return this.nrEtaje = nrEtaje;  
       }  

       public double getpret()
       {  
    	  return pret;
       }
      
       public double setpret(double pret)
       {
    	  return this.pret = pret;  
       }  

       public String afiseazaDetalii() {
   	   return "Casa "+ tipCasa + " cu "+ nrEtaje + " etaje" + "are pretul de "+ pret ;

       }
}






