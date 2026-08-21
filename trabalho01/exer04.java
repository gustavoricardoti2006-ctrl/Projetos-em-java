import java.text.DecimalFormat;
import java.util.Scanner;

public class exer04 {
    public static void main(String[] arg){
         Scanner sc = new Scanner(System.in);
         DecimalFormat sd = new DecimalFormat("#.00");

         System.out.print("Me diga a altura");
         Double altura = sc.nextDouble();

         System.out.print("Me diga a largura");
         Double base = sc.nextDouble();

         Double area =  (2  * (base + altura));

         System.out.print("Valor da altura: " + sd.format(altura) + "Valor da base: " + sd.format(base) + "\na area dessa figura é: " + sd.format(area));

    }
}
