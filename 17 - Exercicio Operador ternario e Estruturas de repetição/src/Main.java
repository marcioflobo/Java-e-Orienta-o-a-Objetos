
import java.util.Scanner;

public class Main {
// Exercicio proposto pela Algaworks do curso Java e orientação a Objetos #MuitoBom
    /*
    Uma loja de ferramentas está precisando da sua ajuda para guardar cada produto em uma gaveta numerada.

O dono da loja quer seguir uma lógica para classificar cada produto, pois assim ele poderá ser organizar melhor. Ele te chama para dizer que quer fazer a classificação pelo código do produto. E começa a te explicar como funcioná a classificação.

A loja possui dois corredores, cada um com 8 gavetas. No corredor da esquerda ficarão os produtos de código ímpar e, no corredor da direita os de código par.

Cada código que for divisível por 8 será armazenado na gaveta 8, os divisíveis por 7 na gaveta 7 e assim por diante.
    
    */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigoProduto = 0;
        do {
            System.out.print("Digite o codigo do produto: ");
            codigoProduto = entrada.nextInt();

            if (codigoProduto != 0) {
                String corredor = (codigoProduto % 2 == 0) ? "\"direita\"" : "\"esquerda\"";

                for (int i = 8; i >= 1; i--) {
                    if (codigoProduto % i == 0) {
                        System.out.println("O produto de codigo: " + codigoProduto
                                + " ficara no corredor da " + corredor + " e na gaveta " + i);

                        break;
                    }
                }
            }
        } while (codigoProduto != 0);
    }
}
