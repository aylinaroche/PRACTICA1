package pack;
import java.util.*;
public class Inciso4 {

//	public void clase4() {
	public static void main(String[] args) {
		
		 String a ;	
			float X;
			char  op=' ';  
			Scanner s = new Scanner(System.in);
			System.out.println("1. C,X para calcular las dimensiones de un Circulo\n");
			System.out.println("2. U,X para calcular las dimensiones de un Cuadrado\n");
			System.out.println("3. T,X para calcular las dimensiones de un Triangulo\n");
		        System.out.println("Ingrese la letra:");  
			a= s.next();
		        System.out.println("Ingrese X");
			X = s.nextFloat();
			 
			 if(a.compareTo("C")==0){
			    op='C';
			 }else if(a.compareTo("U")==0){
		            op='U'; 
			 }else if(a.compareTo("T")==0){
		             op='T';
		         }else{
		             System.out.println("Ingrese una letra valida\n");
		         }
		         
			 switch (op){
			 case 'C': {
				 double pi = 3.1416;
				 double m = (pi*X*X);
				 double n = (2*pi*X);
						 
				 System.out.println("El área es = " + m);
				 System.out.println("El perímetro es = " + n);
				 System.out.println("El radio es = " + X);
				 
				 break;
			 }
			 case 'U': {
				 double j = (X*X);
				 double k = (4*X);
						 
				 System.out.println("El área es = " + j);
				 System.out.println("El perímetro es = " + k);
						// Math.sqrt(arg0)
				 break;
			 }
			 case 'T': {
				 double v =((Math.sqrt(3)/4)*X*X);
				 double r = (3*X);
				 double h = ((Math.sqrt(3)/2)*X);
						 
				 System.out.println("El área es = " + v);
				 System.out.println("El perímetro es = " + r);
				 System.out.println("La altura es = " + h);
				 
				 break;
		         }
			 }  
			 s.close();
	}
}
