import java.util.Random;

public class TesteRandomico {
    public static void main (String[] args){
        System.out.println("Brincando com a classe Math + metodo random");
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*10));
        System.out.println((int)(Math.random()*1000));
        System.out.println("\nBrincando com a classe random");
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextDouble());
        System.out.println(r.nextBoolean());
        System.out.println(r.nextInt(100));
    }
}