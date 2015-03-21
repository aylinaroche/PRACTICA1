package pack;

import java.util.Scanner;

public class Inciso9 {
//	public  void clase9() {
	public static void main(String[] args) {
			
		int num, cent, dec, uni, a, b, c, d;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero arabigo");
		
		num = s.nextInt();
		
		cent = num/100;
		a = cent*100;
		b =num-a;
		
		dec = b/10;
		c = dec*10;
		d = b-c;
		
		uni =d/1;
		System.out.println("El número ingreso en romano es:");
		
switch(cent){
      
case 1:{
	System.out.print("C");
	break;
}
case 2:{
	System.out.print("CC");
	break;
}
case 3:{
	System.out.print("CCC");
	break;
}
case 4:{
	System.out.print("CD");
	break;
}
case 5:{
	System.out.print("D");
	break;
}
case 6:{
	System.out.print("DC");
	break;
}
case 7:{
	System.out.print("DCC");
	break;
}
case 8:{
	System.out.print("DCCC");
	break;
}
case 9:{
	System.out.print("CM");
	break;
}
case 10:{
	System.out.print("M");
	break;
}

}
switch(dec){
case 0:{
	break;
}

case 1:{
	System.out.print("X");
	break;
}
case 2:{
	System.out.print("XX");
	break;
}
case 3:{
	System.out.print("XXX");
	break;
}
case 4:{
	System.out.print("XL");
	break;
}
case 5:{
	System.out.print("L");
	break;
}
case 6:{
	System.out.print("LX");
	break;
}
case 7:{
	System.out.print("LXX");
	break;
}
case 8:{
	System.out.print("LXXX");
	break;
}
case 9:{
	System.out.print("XC");
	break;
}

	}
switch(uni){
case 0:{
	break;
}
case 1:{
	System.out.print("I");
	break;
}
case 2:{
	System.out.print("II");
	break;
}
case 3:{
	System.out.print("III");
	break;
}
case 4:{
	System.out.print("IV");
	break;
}
case 5:{
	System.out.print("V");
	break;
}
case 6:{
	System.out.print("VI");
	break;
}
case 7:{
	System.out.print("VII");
	break;
}
case 8:{
	System.out.print("VIII");
	break;
}
case 9:{
	System.out.print("IX");
	break;
}
case 10:{
	System.out.print("X");
	break;
}
}
s.close();
	}}
