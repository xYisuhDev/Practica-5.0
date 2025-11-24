package sala;

import persona.*;
import java.util.*;

public class Sala {

    private String nombre;
    private int aforoMaximo;
    private boolean pizarra;
    private boolean disponibleReserva;
    private List<Persona> personas;
    private int numeroActualDePersonas;
    private String tipoDeSala;
    private Persona responsable;

    public Sala() {
        this.nombre = null;
        this.aforoMaximo = 0;
        this.pizarra = false;
        this.disponibleReserva = false;
        this.personas = new ArrayList<Persona>();
        this.numeroActualDePersonas = 0;
        this.tipoDeSala = null;
        this.responsable = null;
    }

    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return aforoMaximo;
    }

    public String getTipo() {
        return tipoDeSala;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public int getNumeroActualDePersonas() {
        return numeroActualDePersonas;
    }

    public String getTipoDeSala() {
        return tipoDeSala;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public Persona getResponsable() {
        return responsable;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.aforoMaximo = capacidad;
    }

    public void setPizarra(boolean pizarra) {
        this.pizarra = pizarra;
    }

    public void setTipo(String tipo) {
        if (!tipo.equalsIgnoreCase("estudio") && !tipo.equalsIgnoreCase("lectura")
                && !tipo.equalsIgnoreCase("informatica")) {
            this.tipoDeSala = ("El tipo no es válido");
        } else {
            this.tipoDeSala = tipo;
        }
    }

    public void setDisponibleReserva(boolean disponibleReserva) {
        this.disponibleReserva = disponibleReserva;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public void setNumeroActualDePersonas(int numeroActualDePersonas) {
        this.numeroActualDePersonas = numeroActualDePersonas;
    }

    public void setTipoDeSala(String tipoDeSala) {
        this.tipoDeSala = tipoDeSala;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    // FUNCTIONS

    public void entrarPersona(Persona p) {
        if (personas.size() < this.aforoMaximo) {
            personas.add(p);
            this.numeroActualDePersonas = personas.size();
        } else {
            System.out.println("\nLa sala ya está llena.");
        }
    }

    public void salirPersona(Persona p) {
        personas.remove(p);
        this.numeroActualDePersonas = personas.size();
    }

    public void mostrarPersonas() {
        for (Persona persona : personas) {
            persona.mostrarInformación();
        }
    }

    public void estaDisponible() {
        if (!this.disponibleReserva) {
            System.out.println("    Disponibilidad       -  No está disponible para reservar");
        } else {
            System.out.println("    Disponibilidad       -  Está disponible para reservar");
        }
    }

    public void tienePizarra() {
        if (!this.pizarra) {
            System.out.println("    Pizarra              -  La sala no tiene pizarra");
        } else {
            System.out.println("    Pizarra              -  La sala tiene pizarra");
        }
    }

    public void información() {
        System.out.println("-------------------------- -------------------------");
        System.out.println("    Sala                 -  " + this.nombre + " - " + this.aforoMaximo + " personas");
        System.out.println("    Tipo                 -  " + this.tipoDeSala);
        System.out.println("    Ocupación actual     -  " + this.numeroActualDePersonas);
        System.out.println("    Responsable          -  "
                + (this.responsable != null ? this.responsable.getNombre() : "Sin asignar"));
    }
}
