package main.Tema3;

public class Ex2_Tema3 {
        public static void main(String[] args) {
        	int[] arr;
        	arr = new int[]{12,24,35,4,15,125,34,65,78,90};
        	int max = arr[0];
        	int min = arr[0];
        	for(int i=1; i<arr.length; i++)
               {if(arr[i] > max)
        		  {
            	   max = arr[i];
        		  }
        			
        	    if(arr[i] < min)
        	      {
        	       min = arr[i];
        	      }  
                }
        	System.out.println("Max is:" + max);
        	System.out.println("Min is:" + min);
     	
              }
   }
