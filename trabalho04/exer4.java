/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class exer4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = {5, 4, 6, 1, 7, 2};
		
		int i, indice = -1;
		System.out.printf("digite um numero");
		int num = sc.nextInt();
		
		for(i=0; i< vetor.length; i++){
		    if(num == vetor[i]){
		        indice = i;
		        break;
		    }
		}
		
		if(indice >= 0){
		    	System.out.printf("Numero encontado!! no indice = " + indice);
		}else{
		    	System.out.printf("Numero não encontado");
		}
		
		
		
	}
}
