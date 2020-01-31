package main;

public class Mediu {
	public static void main(String[] args) {
	Mediu m = new Mediu();
	m.method1();
	m.method2();
}
	   int x=0;
	   void method1() {
		     int x=1,y;
		     y=x+1;
	   }
       void method2() {
    	      int z=1;
    	      System.out.println(x);
    	      x=2+z;
    	      System.out.println(x);
       }
}