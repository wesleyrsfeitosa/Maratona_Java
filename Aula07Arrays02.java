
public class Aula07Arrays02 {

	public static void main(String[] args) {
		String[] nomes = new String[3];
		nomes[0] = "Wesley";
		nomes[1] = "Sofia";
		nomes[2] = "Maria";
		
		for(int i=0; i < nomes.length; i++) {
			System.out.println("Nome: " + nomes[i]);
		}
	}

}
