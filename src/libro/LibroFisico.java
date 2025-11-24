package libro;

public class LibroFisico extends Libro {

    private int numPaginas;
    private String ubicacion;

    public LibroFisico() {
        super();
    }

    public LibroFisico(String titulo, String isbn, String editorial, String idioma, int numPaginas, int ano,
            int cantidad, String ubicacion) {
        super();
        setTitulo(titulo);
        setIsbn(isbn);
        setEditorial(editorial);
        setIdioma(idioma);
        setNumPags(numPaginas);
        setAno(ano);
        setCantidad(cantidad);
        this.numPaginas = numPaginas;
        this.ubicacion = ubicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
        setNumPags(numPaginas);
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
