package trabalho08.exe02.dominio;


public class Gerente extends Funcionario{
    private double bonusfixo;
    

    public Gerente(String nome, double salariobase, double bonus){
        super(nome,salariobase);
        this.bonusfixo = bonus;
    }

    public double getBonus(){
        return bonusfixo;
    }

    public void setBonus(double valor){
        this.bonusfixo = valor;
    }

   @Override
    public double calcularSalario() {
    return getSalarioBase() + bonusfixo;
    }
}