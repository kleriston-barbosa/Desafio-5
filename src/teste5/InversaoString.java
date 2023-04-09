package teste5;

import java.util.Scanner;

public class InversaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String palavra;
		String palavraInvertida ="";
		System.out.println("Escreva uma palavra: ");
		palavra = entrada.nextLine().trim();
		
		for(int i = palavra.length()-1; i >= 0; i--) {
			palavraInvertida += palavra.charAt(i);
		}
		System.out.println("Palavra recebida: "+palavra+"\nPalavra invertida: "+palavraInvertida);
	}

}
