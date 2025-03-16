package Exercicios_03.test.Exercico_02;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void adicionarPrato() {
        Pedido pedido = new Pedido(1, "Cliente Teste");
        Prato prato = new Prato("Pizza", 25.0, "Pizza de Calabresa");
        pedido.adicionarPrato(prato);

        List<Prato> pratos = pedido.listaDePratos;
        assertEquals(1, pratos.size());
        assertEquals(prato, pratos.get(0));
        assertEquals(25.0, pedido.total);
    }

    @Test
    void calcularTotal() {
        Pedido pedido = new Pedido(1, "Cliente Teste");
        Prato prato1 = new Prato("Pizza", 25.0, "Pizza de Calabresa");
        Prato prato2 = new Prato("Refrigerante", 5.0, "Coca-Cola");
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);

        assertEquals(30.0, pedido.total);
    }


    @Test
    void visualizarPedido() {
        Pedido pedido = new Pedido(1, "Cliente Teste");
        Prato prato1 = new Prato("Pizza", 25.0, "Pizza de Calabresa");
        pedido.adicionarPrato(prato1);
        pedido.visualizarPedido();

    }
}
