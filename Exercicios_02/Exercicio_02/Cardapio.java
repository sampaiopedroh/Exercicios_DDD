package Exercicios_02.Exercicio_02;

import Exercicios_02.Exercicio_01.Livro;

import java.util.List;

public class Cardapio {
    List<Prato> cardapio;

    public List<Prato> adicionarPrato(Prato prato) {
        this.cardapio.add(prato);
        return this.cardapio;
    }

    public List<Prato> removerPrato(int indice) {
        this.cardapio.remove(indice);
        return this.cardapio;
    }

}
