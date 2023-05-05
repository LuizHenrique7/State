public class ComputadorEstadoDesligado extends ComputadorEstado {


    private ComputadorEstadoDesligado() {};

    private static ComputadorEstadoDesligado instance = new ComputadorEstadoDesligado();
    public static ComputadorEstadoDesligado getInstance() {
        return instance;
    }

    public String getEstado() { return "Desligado"; }


    public boolean ligar(Computador computador) {
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        return true;
    }


}


