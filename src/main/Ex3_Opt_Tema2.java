package main;

public class Ex3_Opt_Tema2 {
       public static void main(String[] args) {
          int n = 7384;
          int sec = n % 60;
          int hour = n / 60;
          int min = hour % 60;
          hour = hour / 60;
          System.out.print( hour + "h " + min + "min " + sec + "sec ");

    }  
}
