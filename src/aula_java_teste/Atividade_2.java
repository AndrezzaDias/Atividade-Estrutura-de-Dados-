package aula_java_teste;

import java.util.Scanner;

public class Atividade_2 {
	public static Scanner scan = new Scanner(System.in);
	public static void resolve (int num1, int num2){
		if(num1 == num2) {
			System.out.println("Numeros iguais" + num1);
		}else if(num1 > num2){
			System.out.println("S�o diferentes, num1 � maior: " + num1);
		}else {
			System.out.println("S�o diferentes, num2 � maior: " + num2);
		}
	}
	
	public static void main(String[] args) {
		
		int num1 = scan.nextInt();
		int num2  = scan.nextInt();
		resolve(num1, num2);
		

	}
	
}
