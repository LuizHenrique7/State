public class Computador {

    private String nome;

    private ComputadorEstado estado;

    public Computador() {
        this.estado = ComputadorEstadoMontado.getInstance();
    }

    public void setEstado(ComputadorEstado estado) {
        this.estado = estado;
    }

    public boolean montar() {
        return estado.montar(this);
    }

    public boolean ligar() {
        return estado.ligar(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

    public boolean reparar() {
        return estado.reparar(this);
    }

    public boolean atualizar() {
        return estado.atualizar(this);
    }

    public boolean esperar() {
        return estado.esperar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ComputadorEstado getEstado() {
        return estado;
    }
}
