public class TecladoAdapter implements EntradaUSB {

    private Teclado teclado;

    public TecladoAdapter (Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public void conectar() {
        System.out.println("Conectando teclado tipo C no gabinete.");
        teclado.conectarTipoC();
    }

}
