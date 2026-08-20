package pbo_java.trabalho01;


import java.util.Scanner;
import java.text.DecimalFormat;


public class MediaAluno{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        DecimalFormat sd = new DecimalFormat("#.00");

        System.out.print("Nome do aluno:");
        String nome = sc.next();

        System.out.print("Nota av1: ");
        double av1 = sc.nextDouble(); 

        System.out.print("Nota av2: ");
        double av2 = sc.nextDouble(); 

        double media = (av1 + av2)/2;

        System.out.println("Nome do aluno: "+ nome + "AV1: " + sd.format(av1) + "AV2: " + sd.format(av2) + "Media: " + sd.format(media));

    }
}

