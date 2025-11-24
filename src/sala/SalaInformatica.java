package sala;

public class SalaInformatica extends Sala {

    private int numEquipos;

    public SalaInformatica() {
        super();
        setTipoDeSala("informatica");
    }

    public SalaInformatica(int numEquipos) {
        this();
        this.numEquipos = numEquipos;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }
}
