
public class CartaoDeCredito implements Pagamento{

    @Override
    public void realizarOPagamento(double Valor) {
        System.out.println("Cartão de Crédito" + Valor);
    }
    
}
