package pack;
import java.util.*;

public class Inciso2{
	
	public  void clase2() {
	//public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);	
	int a=0, b=0, c=0, d=0, e=0, f=0;
	int P;
	
	System.out.println("Ingrese las notas del curso de IPC1");
	a = s.nextInt();  
	if (a>100){
		System.out.println("Debe ingresar notas de 0 a 100");
		a = s.nextInt();  
		}
	else if(a<0){
			System.out.println("Debe ingresar una nota real");
			a = s.nextInt();  
	 }
	
	b = s.nextInt();
	if (b>100){
		System.out.println("Debe ingresar notas de 0 a 100");
		b = s.nextInt();
	}else if(b<0){
		System.out.println("Debe ingresar una nota real");
		b = s.nextInt();
			}
	c = s.nextInt();
	if (c>100){
		System.out.println("Debe ingresar notas de 0 a 100");
		c = s.nextInt();  
	} else if(c<0){
		System.out.println("Debe ingresar una nota real");
		c = s.nextInt();
			}
	d= s.nextInt();
	if (d>100){
		System.out.println("Debe ingresar notas de 0 a 100");
		d = s.nextInt();  
	}else if(d<0){
		System.out.println("Debe ingresar una nota real");
		d = s.nextInt();
			}
	
	e = s.nextInt();
	if (e>100){
		System.out.println("Debe ingresar notas de 0 a 100");
		e = s.nextInt();  
	}else if(e<0){
		System.out.println("Debe ingresar una nota real");
		e = s.nextInt();
			}
	f = s.nextInt();
	if (f>100){
		System.out.println("Debe ingresar notas de 0 a 100");
		f = s.nextInt();  
	}else if(f<0){
		System.out.println("Debe ingresar una nota real");
		f = s.nextInt();
			}
	
	
	P=((a+b+c+d+e+f)/6);
	
	System.out.println("El promedio del estudiante es: " + (P));
	
	      System.out.println();
	     	   
    	   if  (90<P && P<100)
       
			System.out.println("Puntuacion obtenida: A");
			else if (80<P && P<89)
		    System.out.println("Puntuacion obtenida: B");
			else if (70<P && P<79)
			    System.out.println("Puntuacion obtenida: C");
			else if (60<P && P<69)
			    System.out.println("Puntuacion obtenida: D");
			else if (0<P && P<59)
			    System.out.println("Puntuacion obtenida: E");
s.close();
	}

}
