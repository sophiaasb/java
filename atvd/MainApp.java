import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Televisao televisao = new Televisao();

        televisao.ligar();

        System.out.print("Digite o novo volume: ");
        int novoVolume = s.nextInt();

        televisao.ajustarVolume(novoVolume);
        System.out.print("Quer mudar para qual canal??: ");
        
        int novoCanal = s.nextInt();
        televisao.mudarCanal(novoCanal);

        s.close();
    }
}
