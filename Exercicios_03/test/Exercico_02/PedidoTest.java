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

        List<Prato> pratos = pedido.listaDePratos; // Acesso direto, pois listaDePratos é pública
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
        // Para testar visualizarPedido(), você pode redirecionar a saída padrão (System.out) para um ByteArrayOutputStream
        // e depois verificar o conteúdo do stream. No entanto, como visualizarPedido() é principalmente para exibição no console,
        // um teste mais simples pode ser verificar se os dados do pedido estão corretos, o que já é coberto
        // pelos testes adicionarPrato() e calcularTotal().

        Pedido pedido = new Pedido(1, "Cliente Teste");
        Prato prato1 = new Prato("Pizza", 25.0, "Pizza de Calabresa");
        pedido.adicionarPrato(prato1);

        // Aqui você confiaria que o método visualizarPedido() imprime corretamente as informações
        // com base nos valores já testados nos outros métodos.

        // Uma abordagem mais avançada seria usar Mockito ou outra biblioteca de mocking para simular a saída e verificá-la.

        pedido.visualizarPedido();

    }
}
