import java.util.Scanner;
public class Main {
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
    System.out.println("escreva a capacidae do elevador");
    int capacidade = input.nextInt();
    System.out.println("escreva o total de andares");
    int totalAndares = input.nextInt();
    elevador elevador = new elevador(capacidade, totalAndares);
    System.out.print("escreva o que voce quer fazer: ");
    String escreva = System.console().readLine();
    if (escreva.equals("entra")){
      elevador.entra();
      System.out.println("entrou uma pessoa");
    }else if(escreva.equals("sai")){
      elevador.sai();
      System.out.println("saiu uma pessoa");
    }else if(escreva.equals("sobe")){
      elevador.sobe();
      System.out.println("subiu um andar");
    }else if(escreva.equals("desce")){
      elevador.desce();
      System.out.println("desceu um andar");
    }
  }
}