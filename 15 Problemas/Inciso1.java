package pack;

public class Inciso1 {

//		public void Clase1 () {
	public static void main(String[] args) {
		
		//PARTE SUPERIOR		
		int a, b, c, d;
		for (a=1;a<6;a++){
		  //espacios
	    	for (b=5-a;b>0;b--){
		    System.out.print(" ");
	    	}
		 //asteriscos
		    for (c=0;c<a;c++){
		    	//(2a+1)
		  System.out.print("*");
		    }
		    //asteriscos 
		    for (d=0;d<a-1;d++){
		    	System.out.print("*");
		    	}    
		    
		    System.out.println(); 
		}
	//PARTE INFERIOR	
		 int e, f, g, h;
		 for(e=4;e>0;e--){
			 //espacios
		 
			 for(f=5-e;f>0;f--){
				 System.out.print(" ");
			 }
		 //asteriscos izq
		     for(g=e;g>0;g--){
		    	
		    	 System.out.print("*");
		     }
		
             for(h=e-1;h>0;h--){ 
             System.out.print("*");
             	
		}
    	     System.out.println();
		}
		}
}

	
