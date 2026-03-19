class Pix extends Pagamento {

    private String chavePix;

    public Pix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Pix");
        System.out.println("Valor: " + getValor());
        System.out.println("Chave: " + chavePix);
    }
}