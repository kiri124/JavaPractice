import java.util.Scanner;

public class CheeseburgerBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  // Número de casos de prueba

        for (int i = 1; i <= T; i++) {
            int S = scanner.nextInt();  // Cantidad de single cheeseburgers
            int D = scanner.nextInt();  // Cantidad de double cheeseburgers
            int K = scanner.nextInt();  // Número de pisos del cheeseburger

            // Verificar si hay suficientes ingredientes para construir el K-decker cheeseburger
            if (canBuildCheeseburger(S, D, K)) {
                System.out.println("Case #" + i + ": YES");
            } else {
                System.out.println("Case #" + i + ": NO");
            }
        }
    }

    private static boolean canBuildCheeseburger(int singles, int doubles, int layers) {
        // Calcular la cantidad total de ingredientes necesarios
        int totalBuns = layers * 2;
        int totalCheeseSlices = layers - 1;
        int totalPatties = layers;

        // Verificar si hay suficientes ingredientes
        return singles >= totalBuns && doubles >= totalCheeseSlices && doubles >= totalPatties;
    }
}
