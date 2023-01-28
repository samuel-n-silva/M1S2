package exercicio_quatro;

import java.text.NumberFormat;

public class ImpostoRenda {
    private double renda;

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    private static double calcularImpostoFaixa1(double renda) {
        /*
         * implementação para calcular o imposto de renda para quem tem uma renda entre R$6.677,56 a R$9.922,28.
         * com a alíquota de 7,5% e o desconto de R$ 500,82
        */
        return renda * 0.075 - 500.82%2f;
    }

    private static double calcularImpostoFaixa2(double renda) {
        /*
        * implementação para calcular o imposto de renda para quem tem uma renda entre R$9.922,29 a R$13.167,00.
        * com a alíquota de 15% e o desconto de R$ 1.244,99
        **/
        return (renda * 0.15) - 1244.99;
    }

    private static double calcularImpostoFaixa3(double renda) {
        /*
        * implementação para calcular o imposto de renda para quem tem uma renda entre R$13.167,01 a R$16.380,38.
        * com a alíquota de 22,5% e o desconto de R$ 2.232,51
       */
        return (renda * 0.225) - 2231.51;
    }

    public static double calcularImposto(double renda) {

        /*
         * Verificar faixa e realizar calculo
         **/

        if (renda >= 6677.56 && renda <= 9922.28) {
            return calcularImpostoFaixa1(renda);
        } else if (renda >= 9922.29 && renda <= 13167.00) {
            return calcularImpostoFaixa2(renda);
        } else if (renda >= 13167.01 && renda <= 16380.38) {
            return calcularImpostoFaixa3(renda);
        } else {
            System.out.println("--- A renda informada está fora das faixas de tributação ou é isenta de impostos ---");
            return 0;
        }
    }

    /*
    * Calcular o imposto
    * Formarta a moeda
    * imprimir calculo
    * */
    public void imprimirImposto(){
        double imposto = calcularImposto(this.renda);
        NumberFormat moedaBRL = NumberFormat.getCurrencyInstance();
        System.out.println("Valor a pagar de imposto de renda: "+ moedaBRL.format(imposto));
    }

}
