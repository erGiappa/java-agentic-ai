
public class ValoriPari {
    public static void main(String[] args) {

        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Numeri pari:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrice[i][j] % 2 == 0) {
                    System.out.println(matrice[i][j]);
                }

            }
        }
    }
}
