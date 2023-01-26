// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.*;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não
        scan.close();
        System.out.println(eFeliz(n));
    }

    static boolean eFeliz(int n) {
        String texto = String.valueOf(n);
        if (texto.length() == 1) {
            return Integer.parseInt(texto) == 1;
        }
        do {
            String[] vetor = texto.split("");
            int soma = 0;
            for (int x = 0; x < vetor.length; x++) {
                int valor = Integer.parseInt(vetor[x]);
                soma += (valor * valor);
            }
            String somaString = String.valueOf(soma);
            if (somaString.length() == 1) {
                return Integer.parseInt(somaString) == 1;
            }
            texto = somaString;
        } while (texto.length() != 1);
        return false;
    }
}
