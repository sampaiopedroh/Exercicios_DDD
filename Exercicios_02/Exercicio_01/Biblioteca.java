package Exercicios_02.Exercicio_01;

import java.util.List;

public class Biblioteca {
    List<Livro> biblioteca;

    public List<Livro> adicionarLivro(Livro livro) {
        this.biblioteca.add(livro);
        return this.biblioteca;
    }

    public List<Livro> removerLivro(int indice) {
        this.biblioteca.remove(indice);
        return this.biblioteca;
    }
}
