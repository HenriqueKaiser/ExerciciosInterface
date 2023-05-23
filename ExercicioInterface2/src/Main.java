
public class Main {
    public static void main(String[] args) {
        Ataque chute = new Chute();
        Ataque especial = new Especial();
        Ataque soco = new Soco();
        
        chute.executar();
        especial.executar();
        soco.executar();
    }
}
