package pack;

import java.util.Scanner;

public class Problema11{
	
public void clase11(){
	    //public static void main(String[]args){
	        Scanner s = new Scanner(System.in);
	        int n;
	        System.out.print("Ingrese la cantidad de números ROMANOS que ingresará:\n");
	       	        n = s.nextInt();
	      
	       	        System.out.print("Ingrese lista de números ROMANOS:\n");
		
	        char Rom[]= {' ','I','V','X','L','C','D','M'}; 
	        int valor[] = {0,1,5,10,50,100,500,1000};
	        int ant = 0;
	       
	        char letra = ' ';
	        int mayor = 1;
	        int menor = 100;
	        
	        for(int k=0;k<n;k++){
	        	int suma = 0;
	        	   String romano = s.next();
	        for(int i=0; i<romano.length(); i++){
	                letra = romano.charAt(i);
	                
	                for(int j=0; j<Rom.length; j++){//RECORRE ARREGLO ROM
	                    if(letra == Rom[j]){              
	                                suma = suma + valor [j];
	                            if( ant < valor[j]){ //si el valor de letra anterior menor a valor letra   //actual
	                                    suma = suma - ant*2 ; 
	                                    ant = valor[j]; 
	                            }else {
	                        ant = valor[j];
	                       
	                    }
	                       
	                }
	                    
	        } //break;

            }if(suma<menor){
            	menor = suma;
            }
            if(suma>mayor){
            	mayor = suma;
	        }		
	      
    
	       
	        }
	        
	        
	        System.out.println("El número menor es: " + menor);
	    System.out.println("El número mayor es: " + mayor + "\n");
        	
        	
    //    	
        	   String numero;
        	   
               
               int iUnidad = menor%10; //50/5 = 10 *5*
               menor = menor/10;		
               numero = unidadEnTexto(iUnidad);
               
               int iDecena = menor%10;
              menor = menor/10;
         
               if ((iUnidad==0) && (iDecena>0))
               numero = decenaEnTexto(iDecena);
               else if (iDecena==1)
               numero = decenas(10+iUnidad);
               else if (iDecena > 1)
               numero = decenaEnTexto(iDecena) + " y " + numero;
               System.out.println("El número menor en letras es:  "+numero);
       //        
               String numero2;
               
               int Unidad = mayor%10; //50/5 = 10 *5*
               mayor = mayor/10;		
               numero2 = unidadEnTexto(Unidad);
	    
               int Decena = mayor%10;
              mayor = mayor/10;
              
               if ((Unidad==0) && (Decena>0))
               numero2 = decenaEnTexto2(Decena);
               else if (Decena==1)
               numero2 = decenas2(10+Unidad);
               else if (Decena > 1)
               numero2 = decenaEnTexto2(Decena) + " y " + numero2;
               

               int Centena = mayor%10;

               if ((Centena!=1) && (Centena!=5) && (Centena!=9) && (Centena!=0))
               numero2 = unidadEnTexto(Centena) + "cientos" + " " + numero2;
               else if ((Centena==1) || (Centena==5) || (Centena==9))
               numero = centenaEnTexto(Centena) + " " + numero2;
               
               System.out.println("El número mayor en letras es:  "+numero2);
                
	        }
        
    
   public static String centenaEnTexto(int Centena) {
	 		   switch (Centena){
		 	case 1:
		 		return "ciento";
		 	case 2:
		 		return "doscientos";
		 	case 5:
		 		return "quinientos";
		 	case 9:
		 		return "novecientos";				
		 	default:
		 		return "";
		   
	
		}

}
            
            public static String unidadEnTexto(int iNumero){
        // Método que dado un número me lo devuelve en texto		
         switch(iNumero){
        	case 1:
        		return "uno";
        	case 2:
        		return "dos";
        	case 3:
        		return "tres";
        	case 4:
        		return "cuatro";
        	case 5:
        		return "cinco";
        	case 6:
        		return "seis";
        	case 7:
        		return "siete";
        	case 8:
        		return "ocho";
        	case 9:
        		return "nueve";
        //	case 0:
        	//	return "cero";
        	default:
        		return "";
         }
        }
            public static String decenaEnTexto(int iDecena){
        
		switch (iDecena){
        	case 1:
        		return "diez";
        	case 2:
        		return "veinte";
        	case 3:
        		return "treinta";
        	case 4:
        		return "cuarenta";
        	case 5:
        		return "cincuenta";
        	case 6:
        		return "sesenta";
        	case 7:
        		return "setenta";
        	case 8:
        		return "ochenta";
        	case 9:
        		return "noventa";		
        	default:
        		return "";
          }
        }
         public static String decenas(int iDecena){
          switch (iDecena){
        	case 11:
        		return "once";
        	case 12:
        		return "doce";
        	case 13:
        		return "trece";
        	case 14:
        		return "catorce";
        	case 15:
        		return "quince";
        	case 16:
        		return "dieciseis";
        	case 17:
        		return "diecisiete";
        	case 18:
        		return "dieciocho";
        	case 19:
        		return "diecinueve";		
        	default:
        		return "";
          }
         
         }
       
       public static String unidadEnTexto2(int Numero){
   // Método que dado un número me lo devuelve en texto		
    switch(Numero){
   	case 1:
   		return "uno";
   	case 2:
   		return "dos";
   	case 3:
   		return "tres";
   	case 4:
   		return "cuatro";
   	case 5:
   		return "cinco";
   	case 6:
   		return "seis";
   	case 7:
   		return "siete";
   	case 8:
   		return "ocho";
   	case 9:
   		return "nueve";
   	case 0:
   		return "cero";
   	default:
   		return "";
    }
   }
       public static String decenaEnTexto2(int Decena){
   
	switch (Decena){
   	case 1:
   		return "diez";
   	case 2:
   		return "veinte";
   	case 3:
   		return "treinta";
   	case 4:
   		return "cuarenta";
   	case 5:
   		return "cincuenta";
   	case 6:
   		return "sesenta";
   	case 7:
   		return "setenta";
   	case 8:
   		return "ochenta";
   	case 9:
   		return "noventa";		
   	default:
   		return "";
     }
   }
    public static String decenas2(int Decena){
     switch (Decena){
   	case 11:
   		return "once";
   	case 12:
   		return "doce";
   	case 13:
   		return "trece";
   	case 14:
   		return "catorce";
   	case 15:
   		return "quince";
   	case 16:
   		return "dieciseis";
   	case 17:
   		return "diecisiete";
   	case 18:
   		return "dieciocho";
   	case 19:
   		return "diecinueve";		
   	default:
   		return "";
     }
  
	        	 }
	        
                   }
	        	   
                   
	        	   