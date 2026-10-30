package ex3.view;

import ex3.model.*;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta");
        Produto p2 = new Produto("Caderno", 15.50);
        Produto p3 = new Produto("Mochila", 120.00, 10);

        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}