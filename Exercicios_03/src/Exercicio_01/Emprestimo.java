package Exercicios_03.src.Exercicio_01;

public class Emprestimo {
    public Livro livro;
    public Membro membro;
    public String dataEmprestimo;

    public Emprestimo(Livro livro, Membro membro, String dataEmprestimo) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Livro: " + livro + ", Membro: " + membro + ", Data de Empréstimo: " + dataEmprestimo;
    }
}
