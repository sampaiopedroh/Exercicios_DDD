package Exercicios_02.Exercicio_02;

import Exercicios_02.Exercicio_01.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Pedido {
    String numeroPedido;
    String cliente;
    List<Prato> listaDePratos;
    double total;

    public Pedido(String numeroPedido, String cliente, List<Prato> listaDePratos, double total) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.listaDePratos = listaDePratos;
        this.total = total;
    }

    public Pedido novoPedido() {
        var entrada = new Scanner(System.in);
        System.out.print("Diga o seu nome: ");
        String cliente = entrada.nextLine();

        String numeroPedido = String.valueOf(UUID.randomUUID());

        double total = 0.0;

        List<Prato> listaDePratos = new ArrayList<>();

        Cardapio cardapio = new Cardapio();
        for (int i = 0; i < cardapio.cardapio.size(); i++) {
            Prato prato = cardapio.cardapio.get(i);
            System.out.printf("Quer o prato: %s%n", prato.nome);
            boolean querOPrato = entrada.nextBoolean();

            if (querOPrato) {
                listaDePratos.add(prato);
                total += prato.preco;
            }
        }

        Pedido novoPedido = new Pedido(numeroPedido, cliente, listaDePratos, total);
        return novoPedido;
    }
}

