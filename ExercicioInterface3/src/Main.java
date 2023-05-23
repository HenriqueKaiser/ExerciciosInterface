
public class Main {
    public static void main(String[] args) {
        CalculoSalario desenvolvedor = new Desenvolvedor();
        CalculoSalario analista = new  Analista();
        CalculoSalario gerente = new Gerente();
        
       desenvolvedor.calcularSalario();
       analista.calcularSalario();
       gerente.calcularSalario();
        
    }
}
