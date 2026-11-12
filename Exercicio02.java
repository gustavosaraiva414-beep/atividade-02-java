import java.util.Scanner;

public class Exercicio02 {
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < 4; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);

            System.out.printf("Pessoa %d: IMC %.2f - %s%n",
                i + 1, imc, classificarImc(imc));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < 4; i++) {
            pesos[i] = sc.nextDouble();
            alturas[i] = sc.nextDouble();
        }

        exibirRelatorio(pesos, alturas);
    }
}
