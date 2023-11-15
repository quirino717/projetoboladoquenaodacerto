package projeto;

import java.util.ArrayList;

public class Produto implements Interface {

    //Variaveis que a classe Produto possui
    private String nome;
    private ArrayList<Ingrediente> ingrediente;
    private ArrayList<Manufatura> manufatura;
    private float custo;

    //Construtores da classe Produto
    public Produto() {
    }
    
    public Produto(float custo) {
        this.custo = custo;
    }

    public Produto(ArrayList<Ingrediente> ingrediente, ArrayList<Manufatura> manufatura) {
        this.ingrediente = ingrediente;
        this.manufatura = manufatura;
    }

    public Produto(String nome, ArrayList<Ingrediente> ingrediente, ArrayList<Manufatura> manufatura, float custo) {
        this.nome = nome;
        this.ingrediente = ingrediente;
        this.manufatura = manufatura;
        this.custo = custo;
    }

    //Sets e gets que o projeto pede
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public ArrayList<Manufatura> getManufatura() {
        return manufatura;
    }

    public void setManufatura(ArrayList<Manufatura> manufatura) {
        this.manufatura = manufatura;
    }

    public float getCusto() {
        return custo;
    }

    //Funcao para calcular o custo do Produto
    public float calcCusto() {
        float precoManu = 0;
        float precoIngr = 0;

        for (Manufatura manufatura : manufatura) {
            precoManu = precoManu + manufatura.getQtde() * manufatura.getProcesso().getCustohr();
        }

        for (Ingrediente ingrediente : ingrediente) {
            precoIngr = ingrediente.getMateriaprima().getPreco() * ingrediente.getQtd();
        }

        return this.custo = precoManu + precoIngr;
    }

    //Funcao para imprimir as informacoes do Produto
    @Override
    public String imprimir() {
        return "Produto: " + this.nome
                + " | Preco: R$" + this.custo
                + "\n";
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome
                + " | Preco: R$" + this.custo
                + "\n";
    }
    
    
}
