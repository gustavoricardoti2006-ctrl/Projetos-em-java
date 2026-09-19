package trabalho07.exer01.dominio.Produto;
import java.text.Scanner;

class public main(){
    public void static main(String[] args){
        Scanner sc = new Scanner(System.in);

        Produto a = new Produto("batata", 0.88, 130);
        Produto b = new Produto("Tomatea", 0.30, 500);


        System.out.printf("Nome produto: %s", a.getNome());
    }
}


