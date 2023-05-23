
public class Pix implements Pagamento{

    @Override
    public void realizarOPagamento(double Valor) {
        System.out.println("Pix " + Valor);
    }
    
}
