package exercicios;

public class Algoritmo_Bubble_Sort {

	public static void main(String[]args) {
		int vetor[] = {19, 1, 2, 5, 34, 5};
		int ax;
		boolean controle;
		
		for(int i = 0; i < vetor.length; ++i) {
			controle = true;
			for(int j = 0; j < (vetor.length - 1); ++j) {
				
				if(vetor[j] > vetor[j + 1]) {
					ax = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = ax;
					controle = false;
				}
			}
			if(controle) {
				break;
			}
		}
		
		for(int i = 0; i < vetor.length; ++i) {
			System.out.println(vetor[i] + "");
		}
	}
}
