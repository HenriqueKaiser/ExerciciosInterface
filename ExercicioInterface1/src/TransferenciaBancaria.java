
public class TransferenciaBancaria implements Pagamento{

    @Override
    public void realizarOPagamento(double Valor) {
        System.out.println("Transfência " + Valor);
    }
    
}
