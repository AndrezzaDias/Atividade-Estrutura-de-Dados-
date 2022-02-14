package aula_java_teste;

import java.util.Scanner;

public class Atividade_1 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void numero( int num1, int num2) {
		
		
		if( num1  > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}

	public static void main(String[] args) {
		
		
		int pegar1 = scan.nextInt();
		int pegar2  = scan.nextInt();
		numero(pegar1, pegar2);
		
	}
	
}
