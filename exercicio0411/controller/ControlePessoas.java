package exercicio0411.controller;

import java.util.ArrayList;


import exercicio0411.model.Pessoas;

public class ControlePessoas{
 
    private ArrayList<Pessoas> listapessoas;
    private ControleArquivo controlearquivo;

    public ControlePessoas(){
        this.controlearquivo = new ControleArquivo(); // Instancia o repositório
        this.listapessoas = controlearquivo.carregarPessoas(); // Carrega a lista de produtos a partir do arquivo
    }

    public void adicionarPessoa(int id, String nome, int idade, double altura){
        Pessoas pessoa = new Pessoas(id, nome, idade, altura);
        listapessoas.add(pessoa);
        controlearquivo.salvarPessoas(listapessoas);
    }

     public ArrayList<Pessoas> listarPessoa() {
        return new ArrayList<>(listapessoas); // Cópia defensiva da lista
    }

    public boolean excluirPessoa(int id){
     Pessoas p = buscarId(id);
     if(p != null){
        listapessoas.remove(p);
        controlearquivo.salvarPessoas(listapessoas);
        return true;
     }
     else{
        return false;
     }
    }

    public boolean atualizarPessoa(int id, String nome, int idade, double alt){
        Pessoas p = buscarId(id);
        if(p != null){
            p.setId(id);
            p.setNome(nome);
            p.setIdade(idade);
            p.setAltura(alt);
            controlearquivo.salvarPessoas(listapessoas);
            return true;
        }
        else{
            return false;
        }
    }

    private Pessoas buscarId(int id){
        for(Pessoas pessoa: listapessoas){
            if(pessoa.getId() == id){
                return pessoa;
            }
        }

        return null;
    }
}