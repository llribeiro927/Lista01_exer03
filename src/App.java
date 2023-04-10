import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variaveis
        // Entradas: 2 números
       int firstoNumber, secondNumber, result;
       // Entrada de Dados 
       System.out.println("Informe o primeiro número: ");
       Scanner teclado = new Scanner(System.in);
       firstoNumber = teclado.nextInt();

       System.out.println("Informe o segundo número: ");
       secondNumber = teclado.nextInt();
        // Processamento: somar
        result = firstoNumber + secondNumber;
        // Saídas: exibir resultado
        System.out.println("O resultado da soma entre os dois número é: " + result);
    }
}
