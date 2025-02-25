package Exercicios_02.Exercicio_01;

import java.util.Scanner;
import java.util.UUID;

public class Membro {
    String nome;
    String id;
    String email;

    Membro(String nome, String id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public Membro adicionarMembro() {
        var entrada = new Scanner(System.in);
        System.out.print("Diga o seu nome: ");
        String nome = entrada.nextLine();

        String id = String.valueOf(UUID.randomUUID());

        System.out.print("Diga seu email: ");
        String email = entrada.nextLine();

        Membro novoMembro = new Membro(nome, id, email);
        return novoMembro;
    }
}
