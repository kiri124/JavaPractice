import java.util.Scanner;

public class cheeseburger2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  // Número de casos de prueba

        for (int i = 1; i <= T; i++) {
            int A = scanner.nextInt();  // Cantidad de single cheeseburgers
            int B = scanner.nextInt();  // Cantidad de double cheeseburgers
            int C = scanner.nextInt();  // Presupuesto máximo

            // Calcula el máximo K para el cual puedes construir un K-decker cheeseburger
            int maxK = getMaxK(A, B, C);

            // Imprime el resultado
            System.out.println("Case #" + i + ": " + maxK);
        }

        scanner.close();
    }

    private static int getMaxK(int singles, int doubles, int budget) {
        // Calcula el máximo K para el cual puedes construir un K-decker cheeseburger
        int maxK = 0;
        for (int K = 1; K <= singles + doubles; K++) {
            int cost = Math.min(K, singles) + Math.min(K, doubles) * 2;
            if (cost <= budget) {
                maxK = K;
            } else {
                break;  // Detén la búsqueda si el costo supera el presupuesto
            }
        }
        return maxK;
    }
}
