public class ComputadorEstadoReparo extends ComputadorEstado {


    private ComputadorEstadoReparo() {};

    private static ComputadorEstadoReparo instance = new ComputadorEstadoReparo();
    public static ComputadorEstadoReparo getInstance() {
        return instance;
    }

    public String getEstado() { return "Reparo"; }
}


