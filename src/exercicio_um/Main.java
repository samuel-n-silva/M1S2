package exercicio_um;

public class Main {
    public static void main(String[] args) {
        Produto guarana = new Produto();
        Produto acucar = new Produto();

        guarana.produtoNome = "Guarana 2l- Coca-Cola";
        guarana.produtoPreco = 15.95f;
        guarana.validadeProduto = "23/12/2023";

        acucar.produtoNome = "Açucar 2kl - Cristal";
        acucar.produtoPreco = 9.32f;
        acucar.validadeProduto = "12/12/2027";

        System.out.println("Produtos: "+guarana.produtoNome+" Valor: "+guarana.produtoPreco+" Validade: "+guarana.validadeProduto);
        System.out.println("Produtos: "+acucar.produtoNome+" Valor: "+acucar.produtoPreco+" Validade: "+acucar.validadeProduto);
    }
}