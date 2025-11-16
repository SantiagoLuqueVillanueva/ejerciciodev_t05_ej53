public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la figura: "));

        for (int i = 0; i < altura; i++) {
            for (int j = i; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
