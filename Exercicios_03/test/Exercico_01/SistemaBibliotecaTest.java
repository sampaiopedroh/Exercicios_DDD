package Exercicios_03.test.Exercico_01;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaBibliotecaTest {
    @Test
    void adicionarLivro() {
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", "978-8535928089");
        biblioteca.adicionarLivro(livro);
        List<Livro> livros = biblioteca.getLivros();
        assertEquals(1, livros.size());
        assertEquals(livro, livros.get(0));
    }

    @Test
    void removerLivro() {
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", "978-8535928089");
        Livro livro2 = new Livro("1984", "George Orwell", "978-8525055059");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.removerLivro("978-8535928089");
        List<Livro> livros = biblioteca.getLivros();
        assertEquals(1, livros.size());
        assertEquals(livro2, livros.get(0));
    }

    @Test
    void registrarMembro() {
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();
        Membro membro = new Membro("João Silva", 123, "joao.silva@example.com");
        biblioteca.registrarMembro(membro);
        List<Membro> membros = biblioteca.getMembros();
        assertEquals(1, membros.size());
        assertEquals(membro, membros.get(0));
    }

    @Test
    void registrarEmprestimo() {
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", "978-8535928089");
        Membro membro = new Membro("João Silva", 123, "joao.silva@example.com");
        biblioteca.adicionarLivro(livro);
        biblioteca.registrarMembro(membro);

        biblioteca.registrarEmprestimo(livro, membro, "2024-07-26");
        List<Emprestimo> emprestimos = biblioteca.getEmprestimos();

        assertEquals(1, emprestimos.size());
        assertEquals(livro, emprestimos.get(0).livro);
        assertEquals(membro, emprestimos.get(0).membro);
        assertEquals("2024-07-26", emprestimos.get(0).dataEmprestimo);
    }



    @Test
    void devolverLivro() {
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", "978-8535928089");
        Membro membro = new Membro("João Silva", 123, "joao.silva@example.com");
        biblioteca.adicionarLivro(livro);
        biblioteca.registrarMembro(membro);
        biblioteca.registrarEmprestimo(livro, membro, "2024-07-26");

        biblioteca.devolverLivro("978-8535928089");

        List<Emprestimo> emprestimos = biblioteca.getEmprestimos();
        assertEquals(0, emprestimos.size());
    }
}
