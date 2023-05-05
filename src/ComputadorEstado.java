
public abstract class ComputadorEstado {

    public abstract String getEstado();

    public boolean montar(Computador computador) {
        return false;
    }

    public boolean ligar(Computador computador) {
        return false;
    }

    public boolean desligar(Computador computador) {
        return false;
    }

    public boolean reparar(Computador computador) {
        return false;
    }

    public boolean atualizar(Computador computador) {
        return false;
    }

    public boolean esperar(Computador computador) {
        return false;
    }

}
