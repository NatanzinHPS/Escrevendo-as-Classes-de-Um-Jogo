public class App {
    public static void main(String[] args) {
        Heroi mago = new Heroi("Natan", 150, "mago");
        Heroi guerreiro = new Heroi("Natan", 30, "guerreiro");
        Heroi monge = new Heroi("Natan", 40, "monge");
        Heroi ninja = new Heroi("Natan", 19, "ninja");

        mago.atacar();
        guerreiro.atacar();
        monge.atacar();
        ninja.atacar();
    }
}
