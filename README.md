# Instruções para Compilar e Rodar o Código

## Compilação do Código

1. Abra um terminal ou prompt de comando.
2. Navegue até o diretório onde o arquivo Java está localizado. Por exemplo:

   ```
   cd caminho/do/seu/arquivo
   ```

3. Compile o arquivo Java usando o comando `javac` seguido do nome do arquivo Java. Por exemplo:

   ```
   javac MeuPrograma.java
   ```

   Isso irá gerar um arquivo `.class`, que contém o bytecode executável.

## Execução do Programa

1. Após a compilação bem-sucedida, execute o programa Java usando o comando `java` seguido do nome da classe que contém o método `main()`. Por exemplo:

   ```
   java MeuPrograma
   ```

   Substitua `MeuPrograma` pelo nome da sua classe principal.

## Exemplo de Código

```java
public class MeuPrograma {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

Este é um exemplo simples de um programa Java que imprime "Olá, mundo!" no console.
