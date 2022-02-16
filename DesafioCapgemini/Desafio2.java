package desafio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrada: ");
		String senha = sc.nextLine();
		
		System.out.println("Saída: ");
		System.out.println(senha.length());
		
		sc.close();
	}

}
