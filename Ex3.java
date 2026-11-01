package dobackofront;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("O(A) estudante " + nome + " ficou com média " + media);

        sc.close();
    }
}
