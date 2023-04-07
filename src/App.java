import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double peso;
        double pesoLimite = 50;
        double excesso;
        double multa = 4.00;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos KG de peixe Você trouxe?");
        peso = teclado.nextDouble();
        teclado.close();
        excesso = peso - pesoLimite;
        multa = excesso * 4.00;
        System.out.println("Peso excedido: " + excesso);

        if (excesso <= 0) {
            System.out.println("João não tem excedentes, e não precisara pagar multa.");
        }
        if (excesso > 0) {
            System.out.println("Joao excedeu " + excesso
                    + " Quilogramas a mais que o permitido. Tendo assim que pagar uma multa de R$:" + multa);
        }
    }

}
