
package pack;
import java.util.*;

public class Problema13 {
//public void clase13(){
	public static void main(String[] args) {
		
		int aol,aop;
		char c;
		char op;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese una letra");
		c=s.next().charAt(0);
		aol=(int)c;
		do{
		System.out.println("Adivine la letra: ");
		op=s.next().charAt(0);
		aop=(int)op;
		verificar(aop,aol);
		}while(aol!=aop);
		
		s.close();

	}

	private static void verificar(int aop, int aol) {
		if(aop==aol){
			System.out.println("Felicidades encontro la letra");
		}else if(aop<aol){
			System.out.println("La letra que ingreso esta antes de la que busca");
		}else if(aop>aol){
			System.out.println("La letra que ingreso esta despues de la que busca");
		}
		
	}

}
