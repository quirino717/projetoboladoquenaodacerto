package projeto;

public class Operador extends Pessoa{
    
    //Variaveis que a classe Operador possui
    private String cargo;
    private float salhr;

    //Construtores da classe Operador
    public Operador() {
    }

    public Operador(String cargo, float salhr, String nome, Data datanasc, int idade, String cpf, Endereco endereco) {
        super(nome, datanasc, idade, cpf, endereco);
        this.cargo = cargo;
        this.salhr = salhr;
    }

    //Sets e gets que o projeto pede
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalhr() {
        return salhr;
    }

    public void setSalhr(float salhr) {
        this.salhr = salhr;
    }
    
    
    
}
