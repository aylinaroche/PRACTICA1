package pack;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Inciso5 {

//	public void clase5() {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

	System.out.println("Ingrese primer fecha con este formato _/_/_");
	String i = s.next();

	StringTokenizer tokens = new StringTokenizer(i,"/");
 int[] Fecha1= new int [3];
 int a= 0;
 while(tokens.hasMoreTokens()){
     String str=tokens.nextToken();
     Fecha1[a]=Integer.parseInt(str);
         a++;
 }
	int Dia1=Fecha1[0];
	int Mes1=Fecha1[1];
	int Año1=Fecha1[2];

	
	/////////////////////////////////////////
	
	
	System.out.println("Ingrese segunda fecha con este formato _/_/_");
	String k = s.next();

	StringTokenizer token = new StringTokenizer(k,"/");
 int[] Fecha2= new int [3];
 int b= 0;
 while(token.hasMoreTokens()){
     String str=token.nextToken();
     Fecha2[b]=Integer.parseInt(str);
         b++;
 }
	int Dia2=Fecha2[0];
	int Mes2=Fecha2[1];
	int Año2=Fecha2[2];
if(Dia2<31 && Dia1<31 && Mes2<13 && Mes1<13){
	
	int numeroDias = ((Año2-Año1)*360+(Mes2-Mes1)*30+(Dia2-Dia1));
	
	System.out.println("El número de días es  " + numeroDias + "dias");
}
else{
	System.out.println("Ingrese fechas validas");
	
}
	s.close();
	}
	}