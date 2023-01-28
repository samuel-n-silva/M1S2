package exercicio_quatro;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        * Definir idioma padrão do sistema
        * ler a renda do usuario
        * criar novo objeto, imposto de renda
        * */
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        ImpostoRenda novoCalculo = new ImpostoRenda();

        System.out.println("--- Calcular Imposto de renda ---");
        System.out.print("Informe o valor total da sua renda:");

        /*
        * Armazena o valor da renda
        * setar o valor da renda
        * realizar e imprimir imposto
        * */

        double renda = ler.nextDouble();
        novoCalculo.setRenda(renda);
        novoCalculo.imprimirImposto();
    }
}
