package Tema4;

public class TestAnimal {
          public static void main(String[] args) {
        	
        	Animal animal1 = new Animal();   
        	animal1.settipAnimal("Pisica");
        	animal1.setculoare("Alba");
        	animal1.setvarsta(2);
        	
        	Animal animal2 = new Animal();
        	animal2.settipAnimal("Caine");
        	animal2.setculoare("Negru");
        	animal2.setvarsta(4);
        	
        	Animal animal3 = new Animal();
        	animal3.settipAnimal("Iepure");
        	animal3.setculoare("Gri");
        	animal3.setvarsta(1);
        	
        	System.out.println("Tip Animal: " + animal1.gettipAnimal() + "\nCuloare: " + animal1.getculoare() + "\nVarsta: " + animal1.getvarsta());
        	System.out.println("Tip Animal: " + animal2.gettipAnimal() + "\nCuloare: " + animal2.getculoare() + "\nVarsta: " + animal2.getvarsta());  
        	System.out.println("Tip Animal: " + animal3.gettipAnimal() + "\nCuloare: " + animal3.getculoare() + "\nVarsta: " + animal3.getvarsta());  
        	 	  
          }
}
