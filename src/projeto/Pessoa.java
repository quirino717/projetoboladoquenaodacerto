package projeto;

public class Pessoa {

    //Variaveis que a classe Pessoa possui
    private String nome;
    private Data datanasc;
    private int idade;
    private String cpf;
    private Endereco endereco;

    //Construtores da classe Pessoa
    public Pessoa() {
    }

    public Pessoa(String nome, Data datanasc, int idade, String cpf, Endereco endereco) {
        this.nome = nome;
        this.datanasc = datanasc;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    //Sets e gets que o projeto pede
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Data datanasc) {
        this.datanasc = datanasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
