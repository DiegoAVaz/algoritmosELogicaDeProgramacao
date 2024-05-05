public class CemPrimos {
    public static void main (String[] args){
        int contaPrimos = 20;
        int n = 11;
        do{
            int div = 2;
            int metade = n / 2;
            boolean ePrimo = true;
            do {
                if (n % div == 0){
                    ePrimo = false;
                }
                div++;
            } while (div <= metade && ePrimo);
            if (ePrimo) {
                System.out.println(n + " ");
                contaPrimos;
            } 
    /*         else {
                System.out.println(n + " e primo");
            } */
        }
        n++;
    } while(contaPrimos <= 10);
}