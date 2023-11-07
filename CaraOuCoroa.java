import java.util.Scanner;

public class CaraOuCoroa {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cara ou Coroa?");

        String escolhaDoUsuario = scanner.next(); // Lê a escolha como string

        int resultadodaMoeda = (int) (Math.random()*2); // Gera 0 (cara) ou 1 (coroa)

        if (escolhaDoUsuario.equalsIgnoreCase("cara") && resultadodaMoeda == 0) {
            System.out.println("Parabéns! Você ganhou! Era 'cara'.");
        } else if (escolhaDoUsuario.equalsIgnoreCase("coroa") && resultadodaMoeda == 1) {   
        } else {
            System.out.println("Você errou. O resultado foi: " + (resultadodaMoeda == 0 ? "cara" : "coroa"));
    }

    scanner.close();
    }
}