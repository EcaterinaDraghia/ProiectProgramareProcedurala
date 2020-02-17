package Tema4;

public class TestImobil {
	   public static void main(String[] args) {
	   
		   Imobil imobil1 = new Imobil();
		   imobil1.settipCasa("Apartament");
       	   imobil1.setnrEtaje(4);
       	   imobil1.setpret(95000);
	   
       	   Imobil imobil2 = new Imobil();
		   imobil2.settipCasa("Casa");
     	   imobil2.setnrEtaje(0);
     	   imobil2.setpret(70000);
     	   
     	   Imobil imobil3 = new Imobil();
		   imobil3.settipCasa("Vila");
      	   imobil3.setnrEtaje(2);
      	   imobil3.setpret(85000);
	
      System.out.println("Tip Casa: " + imobil1.gettipCasa() + "\nNr Etaje: " + imobil1.getnrEtaje() + "\nPret: " + imobil1.getpret());
      System.out.println("Tip Casa: " + imobil2.gettipCasa() + "\nNr Etaje: " + imobil2.getnrEtaje() + "\nPret: " + imobil2.getpret());
      System.out.println("Tip Casa: " + imobil3.gettipCasa() + "\nNr Etaje: " + imobil3.getnrEtaje() + "\nPret: " + imobil3.getpret());
      
	
	   }
}
