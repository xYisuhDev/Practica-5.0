package persona;

import java.util.ArrayList;
import java.util.List;

import libro.Libro;

public class Usuario extends Persona {

    private String numSocio;
    private List<Libro> listaLibrosPrestados;

    public Usuario() {
        super();
        this.listaLibrosPrestados = new ArrayList<Libro>();
    }

    public Usuario(String numSocio) {
        this();
        this.numSocio = numSocio;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public List<Libro> getListaLibrosPrestados() {
        return listaLibrosPrestados;
    }

    public void prestarLibro(Libro libro) {
        if (libro != null) {
            listaLibrosPrestados.add(libro);
        }
    }

    public void devolverLibro(Libro libro) {
        listaLibrosPrestados.remove(libro);
    }
}
