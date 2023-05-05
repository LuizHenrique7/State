public class ComputadorEstadoLigado extends ComputadorEstado {


    private ComputadorEstadoLigado() {};

    private static ComputadorEstadoLigado instance = new ComputadorEstadoLigado();
    public static ComputadorEstadoLigado getInstance() {
        return instance;
    }

    public String getEstado() { return "Ligado"; }

    public boolean desligar(Computador computador) {
        computador.setEstado(ComputadorEstadoDesligado.getInstance());
        return true;
    }

    public boolean atualizar(Computador computador) {
        computador.setEstado(ComputadorEstadoAtualizado.getInstance());
        return true;
    }

    public boolean esperar(Computador computador) {
        computador.setEstado(ComputadorEstadoEspera.getInstance());
        return true;
    }

    public boolean reparar(Computador computador) {
        computador.setEstado(ComputadorEstadoReparo.getInstance());
        return true;
    }
}


