package projeto;

public class Processo implements Interface {

    
    //Variaveis que a classe Processo possui
    private String nome;
    private float custohr;
    private Operador operador;
    private Equipamento equipamento;

    //Construtores da classe Processo
    public Processo() {
    }

    public Processo(String nome, float custohr, Operador operador, Equipamento equipamento) {
        this.nome = nome;
        this.custohr = custohr;
        this.operador = operador;
        this.equipamento = equipamento;
    }

    //Sets e gets que o projeto pede
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCustohr() {
        return custohr;
    }

    public void setCustohr(float custohr) {
        this.custohr = custohr;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    //Funcao para calcular o custo do Processo
    public float calcCusto() {
        float salario = this.operador.getSalhr();
        float depreciacao = this.equipamento.getDepreciacaohr();
        return (salario + depreciacao);
    }

    //Funcao para imprimir as informacoes do Processo
    @Override
    public String imprimir() {
        return "Tipo de processo: " + this.nome
                + " | Custo por hora: R$" + this.custohr
                + " | Operador: " + operador.getCargo() + " " + operador.getNome()
                + " | Informacoes do equipamento: " + equipamento.getNome() + " " + equipamento.getFabricante()
                + "\n";
    }

}
