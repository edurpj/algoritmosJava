package estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T>  {

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[])new Object[capacidade]; //Solu��o efetiva
		this.tamanho = 0;
	}
	
	/*
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[] Array.newInstance(tipoClasse, capacidade));
		this.tamanho = 0;
	} */
	
	

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adciona(int posicao, T elemento) throws IllegalAccessException {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAccessException("Possi��o inv�lida");
		}

		this.aumentaCapacidade();

		// Mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	// Cria um novo array caso o tamanho for menor
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public Object busca(int posicao) throws IllegalAccessException {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAccessException("Possi��o inv�lida");
		}
		return this.elementos[posicao];
	}

	public void remove(int posicao) throws IllegalAccessException {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAccessException("Possi��o inv�lida");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 2];
		}
		this.tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
}
