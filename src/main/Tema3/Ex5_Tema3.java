package main.Tema3;

public class Ex5_Tema3 {
	public static void main(String[] args) {
		String s = "hello";
		for(int i = 0; i<s.length(); i++) {
		    char ch = s.charAt(i);
	        if (i % 2 == 0) {
	            System.out.print(Character.toUpperCase(ch));
	        } else {
	            System.out.print(Character.toLowerCase(ch));
	        }
	    }  
	}
}
	    	
	    	