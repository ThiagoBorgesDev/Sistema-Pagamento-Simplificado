// HERANÇA
class CartaoCredito extends Pagamento {

    private String numeroCartao;

    public CartaoCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    // POLIMORFISMO (sobrescrita)
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com Cartão de Crédito");
        System.out.println("Valor: " + getValor());
        System.out.println("Cartão: " + numeroCartao);
    }
}