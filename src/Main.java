public class Main {

    public static void main(String[] args) {

        Teclado teclado = new Teclado();

        EntradaUSB tecladoAdapter = new TecladoAdapter(teclado);

        tecladoAdapter.conectar();

    }

}
