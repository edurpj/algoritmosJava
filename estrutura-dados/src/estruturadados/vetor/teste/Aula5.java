package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula5 {

	public static void main(String[] args) throws IllegalAccessException {
		
        Vetor vetor = new Vetor(10);
		
		vetor.adiciona("Elemento1");
		vetor.adiciona("Elemento2");
		vetor.adiciona("Elemento3");
		
		System.out.println(vetor.busca(2));

	}

}
