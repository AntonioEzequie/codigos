import java.util.Scanner;

public class MultaVeiculo { 

 public static void main (String[] args) {
    Scanner entrada = new Scanner (System.in);

    System.out.println("Tipo de veiculo(passeio, caminhão)");
    String tipoVeiculo = entrada.nextLine();

    System.out.println("velocidade maxima da via");
    int velocidadeMaxima = entrada.nextInt();

    System.out.println("Velocidade do veiculo");
    int velocidadeVeiculo = entrada.nextInt();

    // Veiculo de passei com velocidade maior que 10% da velociadade da via 
    // E caminhão com velocidade maiorn que 5% deve receber multa 
  if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) 
  ||  (tipoVeiculo.equals("Caminho") && velocidadeVeiculo > velocidadeMaxima * 1.5)) {
        System.out.println("Multa");
                  
  }

 }

}
