/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class exer5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = {3,8,3,5,7,1,2,4,8,4};
		
		int par[] = new int[vetor.length];
		int impar[] = new int[vetor.length];
		int k = 0, j =0, i;
		
		for( i=0; i< vetor.length; i++){
		    if(vetor[i]%2 == 0){
		        par[k] = vetor[i];
		        k++;
		    }else{
		        impar[j] = vetor[i];
		        j++;
		    }
		}
		
		System.out.printf("----------------\t PARES --------------\n");
		for( i=0; i< k; i++){
		   System.out.printf("vetor["+ i +"] = "+ par[i]+ "\n");
		}
		
		System.out.printf("----------------\t IMPARES --------------\n");
		for( i=0; i< j; i++){
		   System.out.printf("vetor["+ i +"] = "+ impar[i]+ "\n");
		}
	}
}
