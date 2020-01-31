package main;

public class Ex1_Tema2 {
       public static void main(String[] args){
 	      int a=1;
 	      int b= (a=2)*a;
 	      int c= b*(b=5);
 	      System.out.println("a = " + a + ", b = " + b+ ", c = " +c);
     // programul este corect si se va afisa a=2, b=5, c=20
    }
}

