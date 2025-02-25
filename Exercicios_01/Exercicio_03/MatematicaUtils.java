package Exercicios_01.Exercicio_03;

public class MatematicaUtils {
    public static double calcular(double numero1, String operacao, double numero2) {
        return switch (operacao) {
            case "+" -> numero1 + numero2;
            case "-" -> numero1 - numero2;
            case "*" -> numero1 * numero2;
            case "/" -> numero1 / numero2;
            default -> 0;
        };
    }
}
