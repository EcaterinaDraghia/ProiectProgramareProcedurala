package Tema5;

public class Animal {
         private String tipAnimal;
         private String culoare;
         private int varsta;

       public Animal() 
       { tipAnimal = "";
	     culoare = "";
	     varsta = 0;
       }
	   
       public Animal(String tipAnimal)
       {
    	 this.tipAnimal = tipAnimal;
  	     this.culoare = "";
  	     this.varsta = 0;
       }
       
       public Animal(String tipAnimal, String culoare, int varsta)
       {
    	 this.tipAnimal = tipAnimal;
    	 this.culoare = culoare;
    	 this.varsta = varsta;
         } 

       public String gettipAnimal() 
       {
         return tipAnimal;
       }
       
       public String settipAnimal(String tipAnimal)
       {
    	return this.tipAnimal = tipAnimal;  
       }  
       
       public String getculoare() 
       {
         return culoare;
       }
       
       public String setculoare(String culoare)
       {
    	return this.culoare = culoare;  
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
		return "Animalul "+ tipAnimal + " are o blana de culoare "+ culoare + " si varsta de "+ varsta + " luni";
   	    }
}