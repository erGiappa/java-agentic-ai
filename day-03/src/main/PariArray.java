public class PariArray {
    public static void main(String[] args) {

        int [] numeri = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        for (int numero : numeri){
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        }
    }
}
