import java.util.Scanner;

public class ClassificaProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        int codigoProduto = 0;
        do {
            System.out.print("Digite o codigo do produto: ");
            codigoProduto = entrada.nextInt();
                
        } while (codigoProduto != 0);

        if ( codigoProduto != 0); {
            String corredor = (codigoProduto % 2 == 0) ? "\" Direita\"" : "\"Esquerda\"";
             
            for(int i = 8; i  >=1; i--) {
                if (codigoProduto % i == 0) {
                    System.out.println("o produto do codigo:" +  codigoProduto +
                     "facara no corredor da" + corredor + "e na gaveta" + i );

                     break;
                }
            }
        }
    }
}
