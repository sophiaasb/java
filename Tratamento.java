import java.util.Scanner;

public class Tratamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int divisor = 1;
        while (divisor != 0) {
            System.out.print("vc quer dividir uma pizza de 10 fatias pra quantas pessoas?: ");
            divisor = teclado.nextInt();

            try{
                int divisao = 10 / divisor;
            }catch(ArithmeticException e){
                System.out.println("Não foi Possivel Dividir!");
            }finally{
                System.out.println("Finalizando...");
            }
        }


    }
}
