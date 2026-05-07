import java.util.Scanner;

public class SistemaCaixaSupermercado {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

// Bloco de execução (passos / ações a serem executadas).
        System.out.println("Qual o seu produto?");
        String produto1 = leitor.nextLine();
        System.out.println("Qual o valor dele?");
        double valorProduto1 = leitor.nextDouble();
        leitor.nextLine();

        double total = valorProduto1;

        System.out.println("Gostaria de mais algum produto? (Sim/Não)");
        String respostaCliente1 = leitor.nextLine();

// Primeiro IF: Decide o valor total
            if (respostaCliente1.equalsIgnoreCase("Sim")) {
                System.out.println("Qual o seu novo produto?");
                String produto2 = leitor.nextLine();
                System.out.println("Qual o valor deste segundo produto?");
                double valorProduto2 = leitor.nextDouble();
                leitor.nextLine();
                total = valorProduto1 + valorProduto2;
                System.out.println("Perfeito, o valor total da sua compra de " + produto1 + " + " + produto2 + " ficou R$" + total);
            } 
            else {
                System.out.println("Tudo bem, o valor da sua compra de " + produto1 + " ficou R$" + total);
            }
        System.out.println("Quanto você vai pagar em dinheiro?");
        double valorPago = leitor.nextDouble();
        leitor.nextLine();

// Segundo IF: Decide se vai ter troco ou não
            if (valorPago > total) {
                double troco = valorPago - total;
                System.out.println("Seu troco é de R$" + troco);
                System.out.println("Obrigado pela compra!");
            }
            else if (valorPago < total) {
                System.out.println("Está faltando dinheiro!!");
            }
            else {
                System.out.println("Obrigado pela compra!");
            }
    }
}