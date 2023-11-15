package projeto;

public class Equipamento {
    
    //Variaveis que a classe Equipamento possui
    private String nome;
    private String fabricante;
    private Data datafabri;
    private float depreciacaohr;

    //Construtores da classe Equipamento
    public Equipamento() {
    }

    public Equipamento(String nome, String fabricante, Data datafabri, float depreciacaohr) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.datafabri = datafabri;
        this.depreciacaohr = depreciacaohr;
    }

    //Sets e gets que o projeto pede
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Data getDatafabri() {
        return datafabri;
    }

    public void setDatafabri(Data datafabri) {
        this.datafabri = datafabri;
    }

    public float getDepreciacaohr() {
        return depreciacaohr;
    }

    public void setDepreciacaohr(float depreciacaohr) {
        this.depreciacaohr = depreciacaohr;
    }
    
    
    
}
