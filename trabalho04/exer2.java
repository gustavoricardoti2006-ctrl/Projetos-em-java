/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class exer2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[5];
		
		int i;
		
		for(i=0; i < vetor.length; i++){
		    System.out.printf("digite um numero: ");
		    vetor[i] = sc.nextInt();
		}
		
		int maior = vetor[0], menor = vetor[0], indicemaior = 0, indicemenor = 0;
		for(i=1; i < vetor.length; i++){
		    if(maior < vetor[i]){
		        maior = vetor[i];
		        indicemaior = i;
		    }
		    
		    if(menor > vetor[i]){
		        menor = vetor[i];
		        indicemenor = i;
		    }
		}
		
		System.out.printf("o Maior valor é " + maior + " no vetor["+ indicemaior +"]\n");
		System.out.printf("o Menor valor é " + menor + " no vetor["+ indicemenor +"]\n");
	} 
}
