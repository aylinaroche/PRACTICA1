package pack;
import java.util.Scanner;

public class Inciso6 {

	//public void clase6(){
	public static void main(String[] args) {
		
		double a, b;      
		System.out.println("Ingrese dos números");

		Scanner s = new Scanner(System.in);
		a = s.nextDouble();
		b = s.nextDouble();
		String letra;
		char op= ' ';
		System.out.println("Ingrese:");
		System.out.println("s para la suma");
		System.out.println("r para la resta");
		System.out.println("m para la multiplicación");
		System.out.println("d para la división");
		letra = s.next();

		 if(letra.compareTo("s")==0){
		    op='s';
		 }else if(letra.compareTo("r")==0){
	            op='r'; 
		 }else if(letra.compareTo("m")==0){
	             op='m';
		 }else if(letra.compareTo("d")==0){
	             op='d';
	         }else{
	             System.out.println("Ingrese una letra valida\n");
	         }

	//	char.toString(letra);
		//String letra= String.valueOf(h);
switch(op){

case 's': {
	double suma = (a+b);
	System.out.println("La suma es " + suma);
		break;
	}
case 'r': {
	double resta = (a-b);
	System.out.println("La resta es " + resta);
		break;
}
case 'm': {
	double multi = (a*b);
	System.out.println("La multiplicacion es " + multi);
		break;
}
case 'd': {
	double div = (a/b);
	System.out.println("La division es " + div);
		break;
}	
}
s.close();
	}

}
