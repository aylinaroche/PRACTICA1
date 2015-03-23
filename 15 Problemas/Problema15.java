package pack;
import java.util.Scanner;

public class Problema15 {
public void clase15(){
//	public static void main(String[] args) {
	
		int n;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un número");
		n = s.nextInt();
		int a, b=0;
			for(a=1;a<n+1;a++){			
		if(n%a==0){
			b++;
		}	
		//Se usa el contador ya que los numeros primos solos tienen dos divisiores
		//luego se verifica si es iguala a 2 o no
			}
		if(b!=2){
			System.out.println("El número ingresado NO ES PRIMO");
		}
			else{
			System.out.println("El número ingresado ES PRIMO");	
		}
	
         System.out.println("Los números primos entre 1 y el número " +n+ " son: ");
         System.out.println("1");
         for( int i=1; i<n;i++){
	           int k=0;
         for(int j=1;j<i+1;j++){
	     if(i%j==0) //Si es divisible dentro de un numero, hará k++ para luego ver si es primo
		k++;
      }
          if(k==2)
        	System.out.println(i);
         }
 	
s.close();
	}
}
