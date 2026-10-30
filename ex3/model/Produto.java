package ex3.model;

public class Produto {

    private String nome;
    private double preco;
    private int desconto;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("--------------------");
    }
}