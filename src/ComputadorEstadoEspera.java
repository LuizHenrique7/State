public class ComputadorEstadoEspera extends ComputadorEstado {


    private ComputadorEstadoEspera() {};

    private static ComputadorEstadoEspera instance = new ComputadorEstadoEspera();
    public static ComputadorEstadoEspera getInstance() {
        return instance;
    }

    public String getEstado() { return "Espera"; }
}


