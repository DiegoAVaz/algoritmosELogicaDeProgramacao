import java.util.Scanner;

public class LeNumeros {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); // Declara objeto Scanner
        int int1, int2, int3;
        double db1, db2, db3;

        // Entrada de dados
        System.out.print("Digite o primeiro inteiro: ");
        int1 = sc.nextInt();

        System.out.print("Digite o segundo inteiro: ");
        int2 = sc.nextInt();

        // Processamento
        int3 = int1 * int2;

        // Saída
        System.out.println(int1 + " * " + int2 + " = " + int3);

        
        // Entrada de dados
        System.out.print("Digite o primeiro double: ");
        db1 = sc.nextDouble();

        System.out.print("Digite o segundo double: ");
        db2 = sc.nextDouble();

        // Saída
        System.out.println(db1 + " + " + db2 + " = " + (db1 + db2));

        sc.close();
    }
}