package main.Tema3;

public class Ex6_Tema3 {
        public static void main(String[] args) {
        int[] v;
        v = new int[] {5,10,16,18};
        
        double[] v1;
        v1 = new double[v.length];
        
        double n = 2.4;
        
        for(int i = 0; i<v.length; i++)
        {
        	v1[i] = v[i] + n;
            System.out.println("Elementele vectorului sunt: " + v1[i] + ",");
        }
        
        }
}
