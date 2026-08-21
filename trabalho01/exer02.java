import java.util.Scanner;
import java.text.DecimalFormat;


public class exer02 {
    public static void main(String[] arg){
         
         Scanner sc = new Scanner(System.in);
         DecimalFormat sd = new DecimalFormat("#.00");

         System.out.print("Qual o grau em celcius?");
         double c = sc.nextDouble();
         
         double fire = (c * 1.8) + 32;


         System.out.print("O valor de " + sd.format(c) + " Celcius em Fahrenheit é igual a: " + sd.format(fire));
         sc.close();
    }
    

  

}
