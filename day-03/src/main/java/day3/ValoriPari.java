package day3;

public class ValoriPari {
    public static void main(String[] args) {

        // Matrice 3x3 contenente i valori da controllare.
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Numeri pari:");

        // I cicli annidati visitano ogni elemento della matrice.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrice[i][j] % 2 == 0) {
                    System.out.println(matrice[i][j]);
                }

            }
        }
    }
}
