// Ler uma lista de valores até que o usuário digite 0, calcular e mostrar a sua média
public class MediaValores {
    public static void main (String args[]){
        Scanner scanner = nre Scanner(System.in);
        int soma = 0, cont = 0, n;
        do {
            System.out.print("Digite seus valores. 0 encerra: ");
            n = scanner.nextInt();
            if(n != 0){
                soma = soma + n;
                cont++;
            }
        } while (n != 0);
    }
}