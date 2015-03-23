package pack;
import java.util.*;

public class Inciso3 {

public void clase3() {
	//public static void main(String[] args) {
		
		String hora1;  
		int h,m;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la hora seguido de los minutos, (H:M)\n");
		System.out.println("NOTA: Debe ingresar exactamente 5 caracteres\n");
		hora1 = s.next();
		String cadena = new String(hora1);
	
		if(cadena.length()<5){
				
		System.out.println(cadena+" es de "+ cadena.length()+" caracteres");
		System.out.println("Por favor ingrese la hora como se indica");
		} else{
	StringTokenizer tokens=new StringTokenizer(hora1,":");
	int [] hm=new int[2];
	int i=0;
	while(tokens.hasMoreTokens()){
            String str=tokens.nextToken();
            hm[i]=Integer.parseInt(str);
            //System.out.println(String.valueOf(str));
            i++;
        }
	
	m=hm[1];
	if(hm[0]>12 && hm[0]<=24 && m>=0 && m<60){
		h=hm[0]-12;
		System.out.println("Su hora en formato de 12 horas es: \n"+h+":"+hm[1]);
	}else if(hm[0]<12 && hm[0]>0 && m>=0 && m<60){
		System.out.println("Su hora ya esta en formato de 12 horas \n "+hora1);
	}else {
		System.out.println("Ingrese una hora correcta\n");
	}
		}
	 s.close();
	 }
}
