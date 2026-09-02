
import java.util.Scanner;

public class exer1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int vetor[] = new int[5];
		
		for(int i = 0; i < vetor.length; i++){
		    System.out.printf("digite valor" + i + " do vetor: ");
		    vetor[i] = sc.nextInt();
		    
		}
		
		for(int i=0; i < vetor.length; i++){
		    System.out.printf("vetor[" + i +"] = " + vetor[i] +"\n");
		}
		
		
	}
}
