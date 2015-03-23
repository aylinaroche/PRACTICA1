package pack;
import java.util.Scanner;

public class Problema10 {

	public void clase10() {
//	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
			System.out.println("Ingrese un número");
			int num = s.nextInt();
		
			int b=1;
		while(b<num+1){
			int e, f, g;
			 for(e=num;e>0;e--){
		
			  for(f=num-e;f>0;f--){
					 System.out.print(" ");
				 }
		
			     for(g=e;g>0;g--){
			 
			    	 System.out.print(b +" ");
			     }
			     System.out.println();
			     b++;
		}
		}     	      
s.close();
	}
	}
