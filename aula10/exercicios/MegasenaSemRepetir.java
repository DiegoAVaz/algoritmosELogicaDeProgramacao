import java.util.Random;

public class MegasenaSemRepetir {
    public static void main (String[] args){
        int[] jogo = new int[6];

        Random r = new Random();
        jogo[0] = r.nextInt(60) + 1;

        for (int i = 1; i < jogo.length; i++){
            int aux = r.nextInt(60) + 1;
            boolean repete = false;
            for (int j = i - 1; j >= 0 && !repete; j--){
                if(jogo[j] == aux){
                    repete = true;
                }
            }
            if(repete){
                i--;
            } else {
                jogo[i] = aux;
            }
        }
        System.out.print("\nVamos ficar ricos");
        for(int i = 0; i < jogo.length; i++){
            System.out.print(jogo[i] + " ");
        }
    }
}