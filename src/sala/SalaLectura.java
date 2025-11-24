package sala;

import java.util.ArrayList;
import java.util.List;

import libro.Libro;

public class SalaLectura extends Sala {

    private List<Libro> listaLibros;

    public SalaLectura() {
        super();
        setTipoDeSala("lectura");
        this.listaLibros = new ArrayList<Libro>();
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void addLibro(Libro libro) {
        if (libro != null) {
            listaLibros.add(libro);
        }
    }

    public void removeLibro(Libro libro) {
        listaLibros.remove(libro);
    }
}
