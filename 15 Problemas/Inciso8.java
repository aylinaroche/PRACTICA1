package pack;
import java.util.*;
//import java.math.*;

public class Inciso8 {

	public void clase8() {
	//public static void main(String[] args) {
		
		Scanner s  =new Scanner(System.in);
       int LimI, LimS,al;
       Random rnd = new Random(); //Funcion que genera los numeros aleatorios usando math
       
       System.out.println("Ingrese el limite inferior del intervalo");
       LimI=s.nextInt();
       System.out.println("Ingrese el limite superior del intervalo");
       LimS=s.nextInt();
       
       al=(int)Math.floor(Math.random()*(LimI-LimS+1)+LimS); 
       System.out.println("Su número aleatorio es: "+ String.valueOf(al));
       
       String numero;
       
       int iUnidad = al%10; //50/5 = 10 *5*
       al = al/10;		
       numero = unidadEnTexto(iUnidad);
       
       int iDecena = al%10;
       al = al/10;
 
       if ((iUnidad==0) && (iDecena>0))
       numero = decenaEnTexto(iDecena);
       else if (iDecena==1)
       numero = decenas(10+iUnidad);
       else if (iDecena > 1)
       numero = decenaEnTexto(iDecena) + " y " + numero;
       
   
       System.out.println("El número en letras es:  "+numero);
      
       s.close();
System.out.println("Su numero aleatorio es: "+String.valueOf(al));
       
     
	}
	public static String unidadEnTexto(int iNumero){

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
	case 0:
		return "cero";
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
}
