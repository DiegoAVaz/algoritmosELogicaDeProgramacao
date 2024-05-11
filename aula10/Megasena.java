import java.util.Random;

public class Megasena {
    public static void main (String[] args){
        int[] jogo = new int[6];

        Random r = new Random();

        for (int i = 0; i < jogo.length; i++){
            jogo[i] = r.nextInt(60) + 1;
            System.out.print(jogo[i] + " ");
        }
    }
}