package main.Tema3;

public class Ex4_Tema3 {
        public static void main(String[] args) {
        	String s = "HelloWorld";
            int len =s.length();
            for (int i = 0; i < len; i++) 
            
               {
                char charArray = s.charAt(i);
                 System.out.print(charArray + ",");
                }
        }
}
