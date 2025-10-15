import java.util.Scanner;

public class Console{

    public static void main(String[] args){

        // Saida de dados
        System.out.print("Lean");
        System.out.print("dro\n");

        System.out.println("Leandro");

        System.out.printf("Mensagem: %s","Leandro\n");

        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        entrada.nextLine(); //.nextLine eh usado para Strings
        entrada.close();

    }

}