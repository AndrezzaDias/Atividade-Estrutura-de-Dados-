package aula_java_teste;

import java.util.Scanner;

public class Atividade_5 {
	public static Scanner scan = new Scanner(System.in);
	
	public static double  estoq ( double mine, double max) {
		return (mine + max) /  2;
	}

	public static void main(String[] args) {
		System.out.println("Nome do Produto: ");
		String nome = scan.next();
		System.out.println("Qtd minima: ");
		double mine = scan.nextDouble();
		System.out.println("Qtd maxima: ");
		double max = scan.nextDouble();
		System.out.println("Nome do Produto: " + nome );
		System.out.println("Media do Estoque: " + "" + estoq(mine, max));

	}

}
