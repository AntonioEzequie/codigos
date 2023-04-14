import java.util.Scanner;

public class EntradaDeDados {

    public static void main (String[] args) {
      Scanner entrada = new Scanner (System.in);

      System.out.print("Nome: " );
      String nome =  entrada.nextLine ();

      System.out.print("peso: ");
      int peso = entrada.nextInt();

      System.out.print("Altura: " );
      double altura = entrada.nextDouble();

      System.out.print("Sexo (1 para 'M' ou outro NUMERO para 'F'):");
      char sexo = entrada.nextShort() == 1 ? 'M'  : 'F' ;


      double imc = peso / (altura * altura);

      System.out.println("IMC DE " + nome + ": " + imc);

     //_______________A_____________  ||   _________B_______
     if ((sexo == 'F' && imc < 19.1)  || (sexo == 'M' && imc < 20.7 )) {
      System.out.println("Abaixo de peso. ");

     } else if ((sexo == 'F' && imc < 23.9) || (sexo == 'M' && imc < 24.9 )) {
       System.out.println("Pesso ideal");

     } else if ((sexo == 'F' && imc < 28.9) || (sexo == 'M' && imc < 29.9 )) {
       System.out.println("Um pouco acima do peso. ");

     } else if ((sexo == 'F' && imc < 38.9)  || ( sexo == 'M' && imc < 39.9)) {
       System.out.println("Obsesidade moderada");

     } else if ((sexo == 'F' && imc < 39)  || (sexo == 'M' && imc < 40)) {
       System.out.println("Obsesidade morbida");

     }
       

     

    }
      
    
}