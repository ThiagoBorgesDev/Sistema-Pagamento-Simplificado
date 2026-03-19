// ABSTRAÇÃO + HERANÇA
abstract class Pagamento {

    // ENCAPSULAMENTO (atributo privado)
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    // Getter (encapsulamento)
    public double getValor() {
        return valor;
    }

    // Método abstrato (ABSTRAÇÃO)
    public abstract void processarPagamento();
}