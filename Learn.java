import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args
     */
    public static void main (String[] args){        
        System.out.println("\nDigite seu nome: ");
        String nome = sc.next();

        System.out.println("\nDigite seu sobrenome: ");
        String snome = sc.next();

        System.out.println("\nSeja bem vindo: " + nome + " " + snome);

        System.out.println("\nDigite a quantidade de números: ");
        int quant = sc.nextInt();

        System.out.println("\n");
        
        int[] numbers = new int[quant];

        for (int i = 0; i < quant; i++){
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }

        final ArrayList<String> nomes = new ArrayList();
        
        for (int i = 0; i < quant; i++){
            System.out.println("Digite o nome: ");
            String anome = sc.next();
            nomes.add(anome);
        }

        System.out.println(nomes);
    }
}