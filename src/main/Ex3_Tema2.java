package main;

public class Ex3_Tema2 {
       public static void main(String[] args) {
    	   int a = 3;
    	   if(++a<4)
    	         if(a++<4)
    		           System.out.println(a);
    	         else
    		           System.out.println(a);
    	   // Se compileaza dar nu va afisa nimic deoarece nu trece de primul if(4<4)
    	   
       }
 }