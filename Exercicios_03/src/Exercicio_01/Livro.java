package Exercicios_03.src.Exercicio_01;

public class Livro {
    public String titulo;
    public String autor;
    public String ISBN;

    public Livro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + ISBN;
    }
}
