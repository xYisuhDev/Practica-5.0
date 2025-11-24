package sala;

public class SalaEstudio extends Sala {

    private int numMesas;

    public SalaEstudio() {
        super();
        setTipoDeSala("estudio");
    }

    public SalaEstudio(int numMesas) {
        this();
        this.numMesas = numMesas;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }
}
