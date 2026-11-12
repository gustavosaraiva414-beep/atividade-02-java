import java.util.Scanner;

public class Exercicio06 {
    public static int contarVogais(String texto) {
        int quantidade = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i'
                || letra == 'o' || letra == 'u') {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void exibirContagem(String[] frases) {
        int maior = 0;
        int posicao = 0;

        for (int i = 0; i < frases.length; i++) {
            int total = contarVogais(frases[i]);

            System.out.println(frases[i] + " - " + total + " vogais");

            if (total > maior) {
                maior = total;
                posicao = i;
            }
        }

        System.out.println("Frase com mais vogais: " + frases[posicao]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < 3; i++) {
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);
    }
}
