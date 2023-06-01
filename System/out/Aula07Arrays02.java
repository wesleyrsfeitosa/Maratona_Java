package System.out;

import java.util.Scanner;

public class Aula07Arrays02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
				int[] idades = new int[3];
		
				for (int i = 0; i < idades.length; i++) {
					
					
		
					System.out.println("Digite um numero");
					idades[i] = teclado.nextInt();
				}
		
				for (int i = 0; i < idades.length; i++) {
					System.out.println(idades[i]);
				}
	}

}
