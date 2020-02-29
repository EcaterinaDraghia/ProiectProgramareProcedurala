package Tema5;

public class TestAnimal {
          public static void main(String[] args) {
        	
        	Ursulet ursulet1 = new Ursulet();
  	    	
  	        ursulet1.settipAnimal("Panda");
  	    	ursulet1.setculoare("Neagra");
  	    	ursulet1.setvarsta(4);
  	    	
  	    	System.out.println("Ursuletul "+ ursulet1.gettipAnimal()+ " are o blana de culoare "+ ursulet1.getculoare()+" si varsta de "+ ursulet1.getvarsta() + " luni");
			//System.out.println(ursulet1.afiseazaDetalii());


  	        Iepuras iepuras1 = new Iepuras("Havana","Maro",5);
  	  
  		    System.out.println("Iepurasul "+ iepuras1.gettipAnimal()+ " are o blana de culoare "+ iepuras1.getculoare()+" si varsta de "+ iepuras1.getvarsta() + " luni");
		    //System.out.println(iepuras1.afiseazaDetalii());
  	}
  }
        	
        	