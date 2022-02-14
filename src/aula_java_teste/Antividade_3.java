package aula_java_teste;

import java.util.Scanner;

public class Antividade_3 {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static int soma (int num1, int num2) {
		return num1 + num2;
	}
	public static int subitrcao (int num1, int num2) {
		return num1 - num2;
	}
	public static int multi(int num1, int num2) {
		return num1 * num2;
	}
	public static int div (int num1, int num2) {
		return num1 / num2;
	}


	public static void main(String[] args) {
	System.out.println("Digite duas variaveis e a operação: ");	
	System.out.println   ("1. + |" + "2. - |" + "3.* |" + "4. / ");
		 
		int num1 = scan.nextInt();
		int num2  = scan.nextInt();
		int resul = scan.nextInt();
		
		
		while(resul != 0) {
			 if (resul == 1) {
				 int valor = soma(num1, num2);
				 System.out.println(valor);
				 break;
			 }
			 if(resul == 2) {
				 int valor = subitrcao(num1, num2);
				 System.out.println(valor);
				 break;
		 }
			 if(resul == 3) {
				 int valor = multi(num1, num2);
				 System.out.println(valor);
				 break;
		 }
			 if(resul == 4) {
				 int valor = div(num1, num2);
				 System.out.println(valor);
				 break;
		 }
}
	

	}

}
