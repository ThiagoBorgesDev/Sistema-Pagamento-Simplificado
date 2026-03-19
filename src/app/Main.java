public class Main {
    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito(150.0, "1234-5678");
        Pagamento p2 = new Pix(75.0, "email@pix.com");
        Pagamento p3 = new Boleto(200.0, "789123456");

        // POLIMORFISMO
        p1.processarPagamento();
        System.out.println("------------------");

        p2.processarPagamento();
        System.out.println("------------------");

        p3.processarPagamento();
    }
}