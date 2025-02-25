package Exercicios_01.Exercicio_02;

public class Principal {
    public static void main(String[] args) {
        double medida1 = 73;
        double medida2 = 25;

        System.out.printf("%.2fF° para celcius é:", medida1, MatematicaUtils.fahrenheitParaCelcius(medida1));
        System.out.printf("%.2fC° para fahrenheit é:", medida2, MatematicaUtils.fahrenheitParaCelcius(medida2));
    }
}
