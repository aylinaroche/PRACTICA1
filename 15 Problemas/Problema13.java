
package pack;
import java.util.*;

public class Problema13 {
public void clase13(){
//	public static void main(String[] args) {
		
		int iletra,opcion;
		char c;
		char op;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese una letra:");
		c=s.next().charAt(0);
		iletra=(int)c;
		do{
		System.out.println("Adivine la letra: ");
		op=s.next().charAt(0);
		opcion=(int)op;
		verificar(opcion,iletra);
		}while(iletra!=opcion);
		
		s.close();

	}

	public static void verificar(int opcion, int iletra) {
		if(opcion==iletra){
			System.out.println("¡FELICIDADES! Encontró la letra");
		}else if(opcion<iletra){
			System.out.println("La letra que busca esta DESPUÉS");
		}else if(opcion>iletra){
			System.out.println("La letra que busca esta ANTES");
		}
		}
}