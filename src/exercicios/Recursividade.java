package exercicios;

import java.util.Scanner;

public class Recursividade {
		
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor:");
		int num = sc.nextInt();
		System.out.println("O valor do fatorial de "+num+" é igual "+fatorial(num));
	}
	
	public static int fatorialNaoRecursivo(int num) {
			
			if (num == 0) {
				return 1;
			}
			
			int total = 1;
			for (int i = num; i > 1; i--) {
				total *= i;
			}
			return total;
		}	
		
		public static int fatorial(int num) {
			
			if(num == 0) {
				return 1;
			}
			
			return num * fatorial(num -1);
		}
		
	}
