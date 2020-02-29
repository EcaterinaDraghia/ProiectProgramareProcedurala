package Tema5;

public class TestImobil {
	   public static void main(String[] args) {
	   
		   Apartament apartament1 = new Apartament();
		   apartament1.settipCasa("decomandat");
		   apartament1.setnrEtaje(4);
		   apartament1.setpret(95000);
		   
		   System.out.println(apartament1.afiseazaDetalii());
	   
       	   Casa casa1 = new Casa();
       	   casa1.settipCasa("din caramida");
       	   casa1.setnrEtaje(0);
       	   casa1.setpret(70000);
     	   
           System.out.println(casa1.afiseazaDetalii());
	
     
	
	   }
}
