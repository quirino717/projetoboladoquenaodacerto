package projeto;

public class Endereco {

    //Variaveis que a classe Endereco possui
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int num;
    private String complemento;

    //Construtores da classe Endereco
    public Endereco() {
    }

    public Endereco(String estado, String cidade, String bairro, String rua, int num, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.num = num;
        this.complemento = complemento;
    }

    //Sets e gets que o projeto pede
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
