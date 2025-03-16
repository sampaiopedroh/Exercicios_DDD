package Exercicios_03.src.Exercicio_01;

import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {
    private List<Livro> livros;
    private List<Membro> membros;
    private List<Emprestimo> emprestimos;

    public SistemaBiblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(String ISBN) {
        this.livros.removeIf(livro -> livro.ISBN.equals(ISBN));
    }

    public void registrarMembro(Membro membro) {
        this.membros.add(membro);
    }


    public void registrarEmprestimo(Livro livro, Membro membro, String dataEmprestimo) {
        this.emprestimos.add(new Emprestimo(livro, membro, dataEmprestimo));
    }

    public void devolverLivro(String ISBN) {
        this.emprestimos.removeIf(emprestimo -> emprestimo.livro.ISBN.equals(ISBN));
    }


    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

}
