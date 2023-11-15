package projeto;

public class Manufatura {

    //Variaveis que a classe Manufatura possui
    public Processo processo;
    private float qtde;

    //Construtores da classe Manufatura
    public Manufatura() {
    }

    public Manufatura(Processo processo, float qtde) {
        this.processo = processo;
        this.qtde = qtde;
    }

    //Sets e gets que o projeto pede
    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

}
