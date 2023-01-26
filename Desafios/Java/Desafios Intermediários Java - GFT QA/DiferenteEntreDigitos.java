// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class DiferenteEntreDigitos {
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

        // TODO: Retorne a diferença entre o produto e a soma dos dígitos.
        String num = Integer.toString(n);
        //System.out.println(num);
        int qtd = num.length();
        int produto = 1, soma = 0, dif;
        for(int i = 0; i < qtd; i++){
            
            produto *= Character.getNumericValue(num.charAt(i));
            
            soma += Character.getNumericValue(num.charAt(i));;
           

        }
        
        System.out.println(produto-soma);
        
    }
}
