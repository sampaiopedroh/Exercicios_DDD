package Exercicios_03.src.Exercicio_01;

public class Membro {
    public String nome;
    public int id;
    public String email;

    public Membro(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", ID: " + id + ", Email: " + email;
    }
}
