
public class Main {
    public static void main(String[] args) {
        Pagamento pix = new Pix();
        Pagamento cartao = new CartaoDeCredito();
        Pagamento transferencia = new TransferenciaBancaria();
        
        pix.realizarOPagamento(1000);
        cartao.realizarOPagamento(10500);
        transferencia.realizarOPagamento(5000);
    }
}
