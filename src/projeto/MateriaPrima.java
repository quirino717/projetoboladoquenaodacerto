package projeto;

public class MateriaPrima implements Interface {

    //Variaveis que a classe MateriaPrima possui
    private String nome;
    private String unidade;
    private String fornecedor;
    private float preco;

    //Construtores da classe MateriaPrima
    public MateriaPrima() {
    }

    public MateriaPrima(String nome, String unidade, String fornecedor, float preco) {
        this.nome = nome;
        this.unidade = unidade;
        this.fornecedor = fornecedor;
        this.preco = preco;
    }

    //Sets e gets que o processo pede
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //Funcao para imprimir as informacoes da MateriaPrima
    @Override
    public String imprimir() {
        return "Tipo de materia prima: " + this.nome
                + " | Fornecedor: " + this.fornecedor
                + " | Unidade: " + this.unidade
                + " | Preco: R$" + this.preco
                + "\n";
    }

}
