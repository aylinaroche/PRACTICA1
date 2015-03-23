package pack;

import java.util.*;

public class Problema12{
public void clase12(){
	//public static void main(String[] args) {
		String texto;  
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena de texto\n");
		texto=s.nextLine();
		
		int a=0;
while(a<texto.length()-1){
		for(int i=0;i<texto.length();i++){
			
			System.out.print("*");
			a++;	
		}
		if(texto.length()==' '){
		System.out.print(" ");
		}
	      }
		      
		System.out.println();
System.out.println((texto));
System.out.println();



		for(int j=0;j<texto.length();j++){

			if(texto.length()==' '){
			System.out.print(" ");
			}
			System.out.print("*");
			
			
		}	     
		      
		System.out.println();
System.out.println((texto));


s.close();

/*
String texto;
System.out.println("Ingrese una cadena de texto\n\n");
texto = s.nextLine();

int b=0;
//while(a<texto.length()){
for(int i=0;i<texto.length();i++){
	
	System.out.print("*");
	 String a[] = new String[]{texto};
		

	if(a[i]==" ");
	System.out.print("-");
		
}

b++;		
//	       }
    
System.out.println();
System.out.println((texto));
s.close();*/


	}
}