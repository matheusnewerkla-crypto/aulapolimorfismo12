package ex4.view;

import ex4.model.*;

public class Main {
    public static void main(String[] args) {

        PagamentoCartao cartao = new PagamentoCartao();
        PagamentoBoleto boleto = new PagamentoBoleto();

        cartao.processarPagamento();
        boleto.processarPagamento();
    }
}