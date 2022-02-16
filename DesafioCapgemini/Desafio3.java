package desafio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada: ");
		String palavra = sc.nextLine();
		String palavra2 = palavra;
		int cont = 0;
		
		for(int i = 0; i < palavra.length(); i++) {
			for(int j = 0; j < palavra2.length(); j++) {
				if(i != j) {
					if(palavra.charAt(i) == palavra2.charAt(j)) {
						cont++;
					}
				}
			}
		}
		
		System.out.println("Saída: ");
		System.out.println(cont);
		
		
		sc.close();

	}

}
