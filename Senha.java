import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = sc.next();

        if(senha.contentEquals("alfa")) {
            System.out.println("Porta aberta! ");
        } else {
            System.out.println("Porta fechada. ");
        }

        sc.close();
    }
}
