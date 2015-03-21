package pack;
import java.util.Scanner;

public class Problema14 {
// plubic void clase14(){
	public static void main(String[] args) {
  
		int i, j, k, num;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un número del 1 al 10");
		num = s.nextInt();
	if(num<11){			
		for(i=0;i<num;i++){
			System.out.print("* ");
					}
		System.out.println();
		for(int n=0;n<num-2;n++){
        for(j=0;j<num-(num-1);j++){
        	System.out.print("*");
        	{
        	for(k=0;k<2*num-3;k++){
        		System.out.print(" ");
        		        	}
        	System.out.println("*");
        	}
        	        }}
        for(int m=0;m<num;m++){
			System.out.print("* ");
        }}
	else{
		
		System.out.println("El numero ingresado no esta en el rango");
	}
	s.close();
	}
	

}
