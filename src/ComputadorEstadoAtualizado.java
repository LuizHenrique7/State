public class ComputadorEstadoAtualizado extends ComputadorEstado {


    private ComputadorEstadoAtualizado () {};

    private static ComputadorEstadoAtualizado  instance = new ComputadorEstadoAtualizado ();
    public static ComputadorEstadoAtualizado  getInstance() {
        return instance;
    }

    public String getEstado() { return "Atualizado "; }
}


