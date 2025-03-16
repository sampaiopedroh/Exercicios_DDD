package Exercicios_03.src.Exercicio_02;

public class Prato {
    public String nome;
    public double preco;
    public String descricao;


    public Prato(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: " + preco + ", Descrição: " + descricao;
    }
}
