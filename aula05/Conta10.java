public class Conta10 {
    public static void main (String[] args){
        int cont = 1;
        while (cont <= 10) {
            System.out.print (cont + " ");
            cont++;
            int j = 1;
            while (j <= 200000000){
                int k = 1;
                while (k <= 2000000000){
                    k++;
                }
                j++;
            }
        }
    }
}