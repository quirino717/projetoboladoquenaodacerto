package projeto;

import java.util.ArrayList;

public class Pedido implements Interface {

    //Variaveis que a classe Pedido possui
    private int num;
    private Pessoa cliente;
    private Data data;
    private ArrayList<Produto> produto;
    private float totalPedido;

    //Construtores da classe Pedido
    public Pedido() {
    }

    public Pedido(int num, Pessoa cliente, Data data, ArrayList<Produto> produto, float totalPedido) {
        this.num = num;
        this.cliente = cliente;
        this.data = data;
        this.produto = produto;
        this.totalPedido = totalPedido;
    }

    public Pedido(int num, Pessoa cliente, Data data, float totalPedido) {
        this.num = num;
        this.cliente = cliente;
        this.data = data;
        this.produto = new ArrayList<>();
        this.totalPedido = totalPedido;
    }

    //Sets e gets que o projeto pede
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public ArrayList<Produto> getProdutos() {
        return produto;
    }

    public void setProdutos(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public float getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }

    //Funcao que calcula o custo do Pedido
    private float calcPedido() {
        float preco = 0;
        for (Produto produto : produto) {
            preco = preco + produto.getCusto();
        }
        return totalPedido = preco;
    }

    //Funcao para imprimir as informacoes do Pedido
    @Override
    public String imprimir() {
        return "Numero do pedido: " + this.num
                + "\nNome do cliente: " + cliente.getNome()
                + "\nData do pedido: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno()
                + "\nValor do pedido: R$" + this.totalPedido
                + "\n\n";
    }
}
