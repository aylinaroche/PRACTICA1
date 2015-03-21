package pack;
import java.util.Scanner;

public class Problema10 {

	//public void clase10() {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			int j;	
			System.out.println("Ingrese un numero");
			int num = s.nextInt();
		
			for( int i=1; i<num+1;i++){
				
		    	 for(j=num;j>0;j--){
		    	
		    	 System.out.print(i);
		    	 }
		    	
		    	 System.out.println();
		    			     }	
			System.out.println();
			///////////////////////////////////////
			
			 int e, f, g, h;
			 for(e=num;e>0;e--){
		
			  for(f=4-e;f>0;f--){
					 System.out.print(" ");
				 }
		
			     for(g=e;g>0;g--){
			    		for( int i=1; i<num+1;i++){
							
			    		
			    	 System.out.print(i );
			     }
			
			    		}
	    	     System.out.println();
	    	     
			}
			 ///////////////////////////////////////
		/*	 int e, f, g, h;
			 for(e=4;e>0;e--){
		
			  for(f=4-e;f>0;f--){
					 System.out.print(" ");
				 }
		
			     for(g=e;g>0;g--){
			 
			    	 System.out.print("1 ");
			     }
			
		}
	    	     System.out.println();
	    	     */		 
s.close();
	}
	}
