package Exercicios_02.Exercicio_01;

public class Emprestimo {
    Livro livro;
    Membro membro;
    String dataEmprestimo;

    Emprestimo(Livro livro, Membro membro, String dataEmprestimo) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Biblioteca reservarLivro(Biblioteca biblioteca, int indice) {
        for (int i = 0; i < biblioteca.biblioteca.size(); i++) {
            if (i == indice) {
                Livro livro = biblioteca.biblioteca.get(i);
                livro.disponivel = false;
            }
        }
        return biblioteca;
    }

    public Biblioteca devolverLivro(Biblioteca biblioteca, int indice) {
        for (int i = 0; i < biblioteca.biblioteca.size(); i++) {
            if (i == indice) {
                Livro livro = biblioteca.biblioteca.get(i);
                if (!livro.disponivel) {
                    livro.disponivel = true;
                }
            }
        }
        return biblioteca;
    }
}
