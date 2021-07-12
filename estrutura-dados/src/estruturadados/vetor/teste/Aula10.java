package estruturadados.vetor.teste;

import estruturadados.vetor.vetorObjetos;

public class Aula10 {

	public static void main(String[] args) {

		vetorObjetos vetor = new vetorObjetos(3);
		
		contato c1 = new contato("Contato 1", "1234-5678", "contato@gmail.com");
		contato c2 = new contato("Contato 2", "2394-5678", "contato2@gmail.com");
		contato c3 = new contato("Contato 3", "7643-5678", "contato3@gmail.com");
		contato c4 = new contato("Contato 4", "7323-5678", "contato4@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if(pos > -1) {
			System.out.println("Elemento existe");
		} else {
			System.out.println("Elemento n�o existe");
		}
		
		System.out.println(vetor);

	}

}