class Boleto extends Pagamento {

    private String codigoBarras;

    public Boleto(double valor, String codigoBarras) {
        super(valor);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Boleto");
        System.out.println("Valor: " + getValor());
        System.out.println("Código: " + codigoBarras);
    }
}