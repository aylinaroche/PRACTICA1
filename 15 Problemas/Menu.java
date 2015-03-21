package pack;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
System.out.println("PROBLEMAS DEL NIVEL 1");		
System.out.println("1. Problema 1");
System.out.println("2. Problema 2");
System.out.println("3. Problema 3");
System.out.println("4. Problema 4");
System.out.println("5. Problema 5");
System.out.println("PROBLEMAS DEL NIVEL 2");	
System.out.println("6. Problema 6");
System.out.println("7. Problema 7");
System.out.println("8. Problema 8");
System.out.println("9. Problema 9");
System.out.println("10. Problema 10");
System.out.println("11. Problema 11");
System.out.println("12. Problema 12");
System.out.println("13. Problema 13");
System.out.println("14. Problema 14");
System.out.println("15. Problema 14");
System.out.println();	
System.out.println("Escriba el numero del problema; ");
   
              int opcion;
              opcion = s.nextInt();

switch(opcion){

case 1:{
	Inciso1 opcion1 = new Inciso1();
	
	opcion1.Clase1();
	break;
}
case 2:{
	Inciso2 opcion2 = new Inciso2();
	opcion2.clase2();
	break;	
}
case 3:{
	Inciso3 opcion3 = new Inciso3();
	opcion3.clase3();
	break;	
}
case 4:{
	Inciso4 opcion4 = new Inciso4();
	opcion4.clase4();
	break;
}
case 5:{
	Inciso5 opcion5 = new Inciso5();
	opcion5.clase5();
	break;
}
case 6:{
	Inciso6 opcion6 = new Inciso6();
	opcion6.clase6();
	break;
}
case 7:{
	Inciso7 opcion7 = new Inciso7();
	opcion7.clase7();
	break;
}
case 8:{
	Inciso8 opcion8 = new Inciso8();
	opcion8.clase8();
	break;
}
case 9:{
	Inciso9 opcion9 = new Inciso9();
	opcion9.clase9();
	break;
}
case 10:{
	Problema10 opcion10 = new Problema10();
	opcion10.clase10();
	break;
}
case 11:{
	Problema11 opcion11 = new Problema11();
	opcion11.clase11();
	break;	
}
case 12:{
	Problema12 opcion12 = new Problema12();
	opcion12.clase11();
	break;	
}
case 13:{
	Problema13 opcion13 = new Problema13();
	opcion13.clase12();
	break;	
}
case 14:{
	Problema14 opcion14 = new Problema14();
	opcion14.clase11();
	break;	
}
case 15:{
	Problema15 opcion15 = new Problema15();
	opcion15.clase15();
	break;	
}

	
}



s.close();

		
		
	}

}
