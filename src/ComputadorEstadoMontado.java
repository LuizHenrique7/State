public class ComputadorEstadoMontado extends ComputadorEstado {

    private ComputadorEstadoMontado(){};

    private static ComputadorEstadoMontado instance = new ComputadorEstadoMontado();
    public static ComputadorEstadoMontado getInstance() { return instance; }

    public String getEstado() { return "Montado"; }

    public boolean ligar(Computador computador) {
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        return true;
    }

}
