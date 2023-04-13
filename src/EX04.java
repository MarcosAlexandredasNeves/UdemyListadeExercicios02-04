import java.util.Scanner;

public class EX04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hora inicial do jogo: ");
        int h1 = scanner.nextInt();
        System.out.println("Hora final do jogo: ");
        int h2 = scanner.nextInt();
        int duracao = scanner.nextInt();
        if (h1 < h2) {
            duracao = h2 - h1;
        } else {
            duracao = 24 - h1 + h2;
        }
        System.out.println("O jogo durou " +    duracao +" horas.");

        scanner.close();
    }
}
