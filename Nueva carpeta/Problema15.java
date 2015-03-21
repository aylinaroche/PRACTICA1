package pack;
import java.util.Scanner;

public class Problema15 {
//public void clase15(){
	public static void main(String[] args) {
	
		int a, b, n;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un número");
		n = s.nextInt();
		
		b= n-1;
		for(a=2;a<n;a++){
		if(n%a==0){
			System.out.println("No es primo");
					
		break;}}
	double m;
		if(m =n%a){
			System.out.println("Es primo");
		}
		System.out.println("Los números entre 1 y el número ingresado son " + b);

	
	}
s.close();
	}

}
