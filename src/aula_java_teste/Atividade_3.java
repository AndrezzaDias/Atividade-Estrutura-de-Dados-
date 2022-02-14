package aula_java_teste;

import java.util.Scanner;

public class Atividade_3 {
	
	public static Scanner scan = new Scanner(System.in);
	public static int calcula (int num1, int num2) {
		return  num1*num2;
	}

	public static void main(String[] args) {
		int num1 = scan.nextInt();
		int num2  = scan.nextInt();
		
		System.out.println("Resultado: " + calcula(num1, num2));

	}

}
