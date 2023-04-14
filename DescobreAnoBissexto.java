import java.util.Scanner;

public class DescobreAnoBissexto {
      public static void main(String[] args){
            Scanner entrada =new Scanner (System.in);
            System.out.print("Ano: ");

            //Obtem entrada do tipo int
            int ano = entrada.nextInt();

            if (ano % 400 ==0) { //Todos od multiplos de 400 sãobissextos
                  System.out.println("o ano\"" + ano + "\" sim, um ano bissexto");

            } else if (ano % 4 == 0) {
                  if (ano % 100 != 0) {//Multiplo de 4 não multiplo de 100 são bissextos
                        System.out.println("O ano\"" + ano + "\" sim, um ano bissexto");
                  } else {
                        System.out.println("O ano\"" + ano + "\" não e um ano bissexto");
                  }
            } else {
                  System.out.println("O ano\"" + ano + "\" não e um ano bissexto");
            }


            
      }
}
