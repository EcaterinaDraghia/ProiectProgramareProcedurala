package main;

public class Ex2_Opt_Tema2 {
	   public static void main(String[] args) {
           double sum = 500;
           double dob = 0.25;
           int n;// nr de ani
               
           for(n=0;n<5;n++) {
               sum = sum + sum*dob;
           }    
           System.out.println("Suma depusa dupa " + n + " ani este: " + sum);
	   
	   }
}