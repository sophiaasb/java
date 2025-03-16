public class Array {
    
    public static void main(String[] args) {
        int[] Array = {10,20,30,40};
        int indice = 2;

        try {
            System.out.println("Elemento no indice: " +indice+ ":" +Array[indice]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Elemento não está no indíce. ");
        } finally {
            System.out.println("Tchau...");
        }
    }
}
