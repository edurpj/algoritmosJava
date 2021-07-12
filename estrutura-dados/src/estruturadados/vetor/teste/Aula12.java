package estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "D");
		System.out.println(arrayList);
		
		
		// .contains verifica o elemente
		boolean exite = arrayList.contains("D");
		if (exite) {
			System.out.println("Elemento existe ");
		} else {
			System.out.println("Elemento n�o existe ");
		}
		
		int pos = arrayList.indexOf("A");
		if (pos > -1) {
			System.out.println("Elemento existe " + pos);
		} else {
			System.out.println("Elemento n�o existe " + pos);
		}
		
		//Pegando o elemento 
		System.out.println(arrayList.get(2));
		
		//Remover
		arrayList.remove(0);
		arrayList.remove("A");		
		System.out.println(arrayList);
		
		//Tamanho do array
		System.out.println(arrayList.size());
		
		
		//Adiciona em determinada posi��o
		arrayList.set(1, "T");
		System.out.println(arrayList);

	}

}