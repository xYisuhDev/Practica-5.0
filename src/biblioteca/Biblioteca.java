package biblioteca;

import java.util.*;
import libro.Libro;
import libro.LibroDigital;
import libro.LibroFisico;
import persona.Empleado;
import persona.Persona;
import persona.Usuario;
import sala.Sala;
import sala.SalaEstudio;
import sala.SalaInformatica;
import sala.SalaLectura;

public class Biblioteca {

    private String nombre;
    private String direccion;
    private int horarioApertura;
    private int horarioCierre;
    private List<Libro> listaLibros;
    private List<Sala> listaSalas;
    private List<Persona> listaPersonas;

    public Biblioteca() {
        this.nombre = null;
        this.direccion = null;
        this.horarioApertura = 0;
        this.horarioCierre = 0;
        this.listaLibros = new ArrayList<Libro>();
        this.listaSalas = new ArrayList<Sala>();
        this.listaPersonas = new ArrayList<Persona>();
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getHorarioApertura() {
        return horarioApertura;
    }

    public int getHorarioCierre() {
        return horarioCierre;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public List<Sala> getListaSalas() {
        return listaSalas;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHorarioApertura(int horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public void setHorarioCierre(int horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    // FUNCTIONS

    public void registrarVisita(Persona persona) {
        if (persona == null) {
            System.out.println("    No se puede registrar una persona nula.");
            return;
        }

        if (!this.listaPersonas.contains(persona)) {
            this.listaPersonas.add(persona);
        }

        System.out.println("    Visita registrada: " + persona.getNombre() + " ha entrado en la biblioteca.");
    }

    public void addLibro(Libro libro) {
        if (libro == null) {
            System.out.println("    No se puede añadir un libro nulo.");
            return;
        }

        if (!this.listaLibros.contains(libro)) {
            this.listaLibros.add(libro);
            System.out.println("    Libro agregado: " + libro.getTitulo());
        }
    }

    public void removeLibro(Libro libro) {
        this.listaLibros.remove(libro);
    }

    public void mostrarLibros() {
        if (this.listaLibros == null || this.listaLibros.size() == 0) {
            System.out.println("    No hay libros registrados.");
            return;
        }

        for (Libro libro : listaLibros) {

            System.out.println("Nombre: " + libro.getTitulo() + ". \nEditorial: "
                    + libro.getEditorial()
                    + ". \nNúmero pags: " + libro.getNumPags() + ". \nAño: " + libro.getAno() + ". \nEditorial: "
                    + libro.getEditorial() + ". \nIdioma: " + libro.getIdioma() + ". \nCantidad disponible: "
                    + libro.getCantidad() + ". \nISBN: " + libro.getIsbn() + ".");
        }
    }

    public String mostrarLibroPorTitulo(String titulo) {
        if (this.listaLibros == null || this.listaLibros.size() == 0) {
            System.out.println("    No hay libros registrados.");
            return null;
        }

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().contains(titulo)) {
                System.out.println("Nombre: " + libro.getTitulo());
                return libro.getTitulo();
            }
        }

        System.out.println("\nNo se ha encontrado ningún libro con ese título.");
        return null;
    }

    // for (int i = 0; i < libros.size(); i++) {
    // Libro libro = libros.get(i);

    // System.out.println((i + 1) + "." + ". Nombre: " + libro.getTitulo() + ".
    // \nEditorial: " + libro.getEditorial()
    // + ". \nNúmero pags: " + libro.getNumPags() + ". \nAño: " + libro.getAno() +
    // ". \nEditorial: "
    // + libro.getEditorial() + ". \nIdioma: " + libro.getIdioma() + ". \nCantidad
    // disponible: "
    // + libro.getCantidad() + ". \nISBN: " + libro.getIsbn() + ".");

    // }

    public Sala addSala(Sala sala) {
        Sala salaPropia = sala;

        if (salaPropia == null) {
            salaPropia = new Sala();
        }

        if (!this.listaSalas.contains(salaPropia)) {
            this.listaSalas.add(salaPropia);
            System.out.println("    Sala registrada: "
                    + (salaPropia.getNombre() != null ? salaPropia.getNombre() : "Sala sin nombre"));
        }

        return salaPropia;
    }

    public void removeSala(Sala sala) {
        this.listaSalas.remove(sala);
    }

    public void mostrarSalas() {
        if (this.listaSalas == null || this.listaSalas.size() == 0) {
            System.out.println("    No hay salas registradas.");
            return;
        }

        for (Sala sala : listaSalas) {
            System.out.println("Nombre: " + sala.getNombre() + ". \nTipo: " + sala.getTipo() + ". \nCapacidad: "
                    + sala.getCapacidad() + ". \nPersonas en sala: " + sala.getPersonas());

        }
    }

    public void mostrarPersonasSalas() {
        int totalPersonas = 0;
        for (Sala sala : listaSalas) {
            totalPersonas = totalPersonas + sala.getPersonas().size();
        }
    }

    public void mostrarSalasDisponibles() {
        for (Sala sala : listaSalas) {
            if (sala.getPersonas().size() == 0) {
                sala.información();
            }
        }
    }

    public void addPersona(Persona persona) {
        this.listaPersonas.add(persona);
    }

    public void removePersona(Persona persona) {
        this.listaPersonas.remove(persona);
    }

    public void asignarResponsable(Sala sala, Persona persona) {
        if (sala == null || persona == null) {
            System.out.println("    Sala o persona no válidas para asignar responsable.");
            return;
        }

        if (!this.listaSalas.contains(sala)) {
            this.listaSalas.add(sala);
        }

        if (!this.listaPersonas.contains(persona)) {
            this.listaPersonas.add(persona);
        }

        sala.setResponsable(persona);
        System.out.println("    Responsable asignado: " + persona.getNombre() + " -> " + sala.getNombre());
    }

    public void estaAbierta(int hora) {
        if (hora > horarioApertura && hora < horarioCierre) {
            System.out.println("    ¿Está abierta?       -  Sí");
        } else {
            System.out.println("    ¿Está abierta?       -  No");
        }
    }

    public void mostrarBiblioteca() {
        System.out.println("-------------------------- -------------------------");
        System.out.println("    Biblioteca           -  " + this.nombre + " - " + this.direccion);
        System.out.println("    Abierto de           -  " + this.horarioApertura + " a " + horarioCierre);
        System.out.println("    Personas registradas -  " + this.listaPersonas.size());
        mostrarLibros();
        mostrarSalas();
    }

    public void mostrarPersonas() {
        if (this.listaPersonas == null || this.listaPersonas.size() == 0) {
            System.out.println("    No hay personas registradas.");
            return;
        }

        for (Persona persona : listaPersonas) {
            persona.mostrarInformación();
        }
    }

    public void mostrarInformacion() {
        System.out.println("================= INFORME COMPLETO =================");
        System.out.println("Biblioteca: " + this.nombre + " - " + this.direccion);
        System.out.println("Horario: " + this.horarioApertura + " - " + this.horarioCierre);
        System.out.println("Personas registradas: " + this.listaPersonas.size());

        System.out.println("\n-- Salas --");
        if (this.listaSalas.isEmpty()) {
            System.out.println("    No hay salas registradas.");
        } else {
            for (Sala sala : listaSalas) {
                sala.información();
                if (sala instanceof SalaLectura) {
                    SalaLectura lectura = (SalaLectura) sala;
                    System.out.println("    Libros en sala lectura: " + lectura.getListaLibros().size());
                } else if (sala instanceof SalaEstudio) {
                    SalaEstudio estudio = (SalaEstudio) sala;
                    System.out.println("    Mesas disponibles     -  " + estudio.getNumMesas());
                } else if (sala instanceof SalaInformatica) {
                    SalaInformatica info = (SalaInformatica) sala;
                    System.out.println("    Equipos disponibles   -  " + info.getNumEquipos());
                }
            }
        }

        System.out.println("\n-- Libros --");
        if (this.listaLibros.isEmpty()) {
            System.out.println("    No hay libros registrados.");
        } else {
            for (Libro libro : listaLibros) {
                libro.información();
                if (libro instanceof LibroFisico) {
                    LibroFisico fisico = (LibroFisico) libro;
                    System.out.println("    Tipo: Físico - Páginas " + fisico.getNumPaginas()
                            + ", Ubicación: " + fisico.getUbicacion());
                } else if (libro instanceof LibroDigital) {
                    LibroDigital digital = (LibroDigital) libro;
                    System.out.println("    Tipo: Digital - Formato " + digital.getFormato()
                            + ", Tamaño: " + digital.getTamanoMB() + " MB");
                }
            }
        }

        System.out.println("\n-- Personas --");
        if (this.listaPersonas.isEmpty()) {
            System.out.println("    No hay personas registradas.");
        } else {
            for (Persona persona : listaPersonas) {
                persona.mostrarInformación();
                if (persona instanceof Usuario) {
                    Usuario usuario = (Usuario) persona;
                    System.out.println("    Tipo: Usuario - Nº socio " + usuario.getNumSocio()
                            + ", Libros prestados: " + usuario.getListaLibrosPrestados().size());
                } else if (persona instanceof Empleado) {
                    Empleado empleado = (Empleado) persona;
                    System.out.println("    Tipo: Empleado - Puesto " + empleado.getPuesto()
                            + ", Sueldo: " + empleado.getSueldo());
                }
            }
        }

        System.out.println("====================================================\n");
    }
}