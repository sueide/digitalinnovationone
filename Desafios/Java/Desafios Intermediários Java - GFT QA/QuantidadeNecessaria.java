// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;
import java.lang.Math;

public class QuantidadeNecessaria {
  public static void main(String[] args) {
    final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();

    // TODO: Retorne o número de pizzas necessárias para atender o pedido.
    int N = scanner.nextInt();
    int X = scanner.nextInt();
    System.out.println((int) (Math.ceil((X / SLICE) * N) + 1));
  }
}
