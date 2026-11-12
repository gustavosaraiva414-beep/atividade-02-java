import java.util.Scanner;

public class Exercicio07 {
    public static String gerarIniciais(String nome) {
        String iniciais = "";

        nome = nome.trim();

        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) != ' ' && (i == 0 || nome.charAt(i - 1) == ' ')) {
                iniciais = iniciais + Character.toUpperCase(nome.charAt(i)) + ".";
            }
        }

        return iniciais;
    }

    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i] +
                " (" + gerarIniciais(nomes[i]) + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];

        for (int i = 0; i < 4; i++) {
            nomes[i] = sc.nextLine();
        }

        exibirChamada(nomes);
    }
}
