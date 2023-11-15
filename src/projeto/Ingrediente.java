package projeto;

public class Ingrediente {

    //Variaveis que a classe Ingrediente possui
    private int qtd;
    public MateriaPrima materiaprima;

    //Construtores do Ingrediente
    public Ingrediente() {
    }

    public Ingrediente(int qtd, MateriaPrima materiaprima) {
        this.qtd = qtd;
        this.materiaprima = materiaprima;
    }

    //Sets e gets que o projeto pede
    public float getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public MateriaPrima getMateriaprima() {
        return materiaprima;
    }

    public void setMateriaprima(MateriaPrima materiaprima) {
        this.materiaprima = materiaprima;
    }

    
    //Funcao para imprimir as informacoes do ingrediente
    @Override
    public String toString() {
        return "Tipo de materia prima: " + materiaprima.getNome()
                + " | Fornecedor: " + materiaprima.getFornecedor()
                + " | Unidade: " + materiaprima.getUnidade()
                + " | Preco: R$" + materiaprima.getPreco()
                + "\n";
    }
    
    

}
