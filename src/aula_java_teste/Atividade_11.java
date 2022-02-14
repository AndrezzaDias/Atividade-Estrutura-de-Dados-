package aula_java_teste;

import java.util.Scanner;

public class Atividade_11 {
	public static Scanner scan = new Scanner(System.in);
	
	public static double MedAr( double n1, double n2, double n3) {
		
		return (n1+n2+n3) /3;
	}

	public static void main(String[] args) {
		System.out.println("Nome:");
		String nome = scan.next();
		System.out.println("Informe as 3 notas da prova: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Medias Aritimetica: " + MedAr(n1,n2,n3));

	}

}
