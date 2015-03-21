package pack;
import java.util.*;
import java.math.*;

public class Inciso8 {

  //  public void clase8() {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
       int n0,n1,al;
       Random rnd = new Random(); //Inicio de la funcion que genera los numeros aleatorios usando math
       
       System.out.println("Ingrese el limite inferior del intervalo");
       n0=s.nextInt();
       System.out.println("Ingrese el limite superior del intervalo");
       n1=s.nextInt();
       
       al=(int)Math.floor(Math.random()*(n0-n1+1)+n1); 
       System.out.println("Su numero aleatorio es: "+String.valueOf(al));
       
       String numero;
       
       int iUnidad = al%10;
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
       
       int iCentena = al%10;
 
       if ((iCentena!=1) && (iCentena!=5) && (iCentena!=9) && (iCentena!=0))
       numero = unidadEnTexto(iCentena) + "cientos" + " " + numero;
       else if ((iCentena==1) || (iCentena==5) || (iCentena==9))
       numero = centenaEnTexto(iCentena) + " " + numero;
       
       System.out.println("El numero en letras es:  "+numero);
       
       
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
 public static String centenaEnTexto(int iCentena){
  switch (iCentena){
	case 1:
		return "ciento";
	case 5:
		return "quinientos";
	case 9:
		return "novecientos";				
	default:
		return "";
  }
  //s.close();
}
}
