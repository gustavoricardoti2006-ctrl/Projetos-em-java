
import java.util.Scanner;
import java.text.DecimalFormat;

public class exer3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat sd = new DecimalFormat("#.00");
		
		double vetor[] = {2.5, 6.8, 7.9, 8.0, 9.5, 1.5, 2.7, 6.8};
        
        int i;
        double sum = 0, media = 0;
        
        for(i=0; i< vetor.length;i++){
            sum += vetor[i];
        }
        
        media = sum/vetor.length;
        
        System.out.printf("A media da turma é: " + sd.format(media) + "\n");
        
        for(i=0; i< vetor.length; i++){
            if(vetor[i] >= 6){
                System.out.printf("Aluno " + (i+1) + "° - Acima da media\n");
            }
        }
		sc.close();
	}
}
