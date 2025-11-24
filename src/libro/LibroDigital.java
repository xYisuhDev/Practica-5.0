package libro;

public class LibroDigital extends Libro {

    private String formato;
    private double tamanoMB;

    public LibroDigital() {
        super();
    }

    public LibroDigital(String titulo, String isbn, String editorial, String idioma, int numPaginas, int ano,
            double tamanoMB, String formato) {
        super();
        setTitulo(titulo);
        setIsbn(isbn);
        setEditorial(editorial);
        setIdioma(idioma);
        setNumPags(numPaginas);
        setAno(ano);
        this.tamanoMB = tamanoMB;
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public void setTamanoMB(double tamanoMB) {
        this.tamanoMB = tamanoMB;
    }
}
