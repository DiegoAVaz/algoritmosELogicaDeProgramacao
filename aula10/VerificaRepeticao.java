import java.util.Random;

public class VerificaRepeticao {
    public static void main (String[] args){
        Random random = new Random();

        int[] v = new int[12];

        for (int i = 0; i < v.length; i++){
            v[i] = random.nextInt(2 * v.length);
            System.out.print(v[i] + " ");
        }

        int i, j = 0;

        boolean temRepeticao = false;
        for(i = 0; i < v.length - 1 && !temRepeticao; i++){
            for(j = i + 1; j < v.length && !temRepeticao; j++){
                if (v[i] == v[j]){
                    temRepeticao = true;
                }
            }
        }
        if (temRepeticao){
            System.out.println("Tem repeticoes no vetor.");
            System.out.println("Primeira ocorrencia posicoes: " + i + ", " + j);
        } else {
            System.out.println("Nao tem repeticoes no vetor.");
        }
    }
}