package view;

import br.edu.fateczl.arvoreint.Arvore;

public class main {

	public static void main(String[] args) throws Exception {
		int[] vet =  {33, 15, 41, 38, 47, 34, 49, 43};
		Arvore arvore = new Arvore();
		for(int i : vet) {
			arvore.insert(i);
		}
		arvore.prefixSearch();
		System.out.println(" ");
		arvore.postfixSearch();
		System.out.println(" ");
		arvore.infixSearch();
	}

}
