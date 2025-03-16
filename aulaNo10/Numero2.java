import java.util.Scanner;

public class Numero2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerador = sc.nextInt();
        
        System.out.println("Informe o denominador: ");
        int denominador = sc.nextInt();

        int resultado = 0;

        try{
            resultado = numerador/denominador;
        } catch(ArithmeticException e) {
            System.out.println("Erro: divisão por zero não pode ocorrer. ");
        } catch(Exception e) {
            System.out.println("Erro inesperado" +e.getMessage());
        } finally {
            System.out.println("Resultado: " +resultado);
            System.out.println("Finalizando... ");
        }

        sc.close();

    }
}
