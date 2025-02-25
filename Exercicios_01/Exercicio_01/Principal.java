package Exercicios_01.Exercicio_01;

public class Principal {
    public static void main(String[] args) {
        double medida = 1;
        System.out.printf("%.2f em centímetros é: %.2f%n", medida, MatematicaUtils.passarMetrosParaCentimetros(medida));
        System.out.printf("%.2f em milímetros é: %.2f%n", medida, MatematicaUtils.passarMetrosParaMilimetros(medida));
    }
}
