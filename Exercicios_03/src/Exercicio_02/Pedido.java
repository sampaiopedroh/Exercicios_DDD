package Exercicios_03.src.Exercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public int numeroPedido;
    public String cliente;
    public List<Prato> listaDePratos;
    public double total;

    public Pedido(int numeroPedido, String cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.listaDePratos = new ArrayList<>();
        this.total = 0;
    }

    public void adicionarPrato(Prato prato) {
        this.listaDePratos.add(prato);
        this.total += prato.preco;
    }


    public void visualizarPedido() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Pratos:");
        for (Prato prato : listaDePratos) {
            System.out.println("- " + prato);
        }
        System.out.println("Total: " + total);
    }
}
