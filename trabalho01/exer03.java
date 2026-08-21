import java.util.Scanner;
import java.text.DecimalFormat;

public class exer03 {
    public static void main(String[] arg){

     Scanner sc = new Scanner(System.in);
     DecimalFormat sd = new DecimalFormat("#.00");
     
     System.out.print("Valor da hora: ");
     Double valh = sc.nextDouble();

     System.out.print("Quantas horas no mês:");
     int horas = sc.nextInt(); 

     Double valor_bruto = valh * horas;

     double valor_liquido = valor_bruto * 0.10;

     double resultado = valor_bruto - valor_liquido;

     System.out.print("Trabalhando por " + horas + " Horas e recebendo " + sd.format(valh) + " por hora \nValor bruto: " + sd.format(valor_bruto) + "\n15liquido:" + sd.format(resultado) );

     sc.close();
    }
}
