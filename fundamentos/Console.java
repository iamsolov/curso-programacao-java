import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        // SAÍDA DE DADOS

        // print(): imprime sem quebrar a linha
        System.out.print("Lean");
        System.out.print("dro\n"); // '\n' força quebra de linha

        // println(): imprime e depois quebra a linha automaticamente
        System.out.println("Leandro");

        // printf(): permite formatar a saída, similar ao printf do C
        System.out.printf("Mensagem formatada: %s\n", "Leandro");

        // ENTRADA DE DADOS

        // Criação do objeto Scanner para capturar dados do teclado
        Scanner entrada = new Scanner(System.in);

        // Exemplo 1: lendo uma string (linha inteira)
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); // lê até o Enter
        System.out.println("Olá, " + nome + "! Seja bem-vindo");

        // Exemplo 2: lendo um número inteiro
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt(); // lê apenas um número inteiro
        System.out.println("Você tem " + idade + " anos");

        // Exemplo 3: lendo um número decimal (ponto flutuante)
        System.out.print("Digite sua altura (em metros): ");
        double altura = entrada.nextDouble(); // lê um valor double
        System.out.println("Altura registrada: " + altura + " m");

        // Importante: se for ler uma String depois de nextInt() ou nextDouble(),
        // é preciso "limpar" o buffer com nextLine(), pois sobra um '\n' no stream.
        entrada.nextLine(); // consome o caractere de quebra de linha pendente

        // Exemplo 4: leitura mista (texto depois de número)
        System.out.print("Digite seu endereço: ");
        String endereco = entrada.nextLine();
        System.out.println("Cidade registrada: " + endereco);

        // Sempre feche o Scanner para liberar o recurso do teclado
        entrada.close();
        
    }
}
