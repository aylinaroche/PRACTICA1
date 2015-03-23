package pack;
import java.util.Scanner;

public class Inciso7 {

	public void clase7() {
//	public static void main(String[] args) {
		
		int a, i;
		
		System.out.println("Ingrese un numero");
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		
		if (a<10){
		for (i=10; i>0 ; i--){
	     int m = (a*i);
			System.out.println(a + "x" + i + " = " + m);
			System.out.println();
			}
		}
		else{
			System.out.println("Ingrese un numero de 0 a 10");	
		}
		s.close();
	}
}
