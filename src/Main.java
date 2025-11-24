import java.time.LocalTime;

import biblioteca.Biblioteca;
import libro.LibroDigital;
import libro.LibroFisico;
import persona.Empleado;
import persona.Usuario;
import sala.SalaEstudio;
import sala.SalaInformatica;
import sala.SalaLectura;

public class Main {
    public static void main(String[] args) {

        Biblioteca central = new Biblioteca();
        central.setNombre("Central");
        central.setDireccion("Av. de la Cultura, 10");
        central.setHorarioApertura(9);
        central.setHorarioCierre(21);

        int hora = LocalTime.now().getHour();
        central.estaAbierta(hora);

        LibroFisico quijote = new LibroFisico();
        quijote.setTitulo("Don Quijote de la Mancha");
        quijote.setIsbn("9788491050292");
        quijote.setEditorial("RBA");
        quijote.setIdioma("ES");
        quijote.setAno(2015);
        quijote.setCantidad(3);
        quijote.setUbicacion("Estantería F1");
        quijote.setNumPaginas(1056);

        LibroDigital cleanCode = new LibroDigital();
        cleanCode.setTitulo("Clean Code");
        cleanCode.setIsbn("9780132350884");
        cleanCode.setEditorial("Prentice Hall");
        cleanCode.setIdioma("EN");
        cleanCode.setAno(2008);
        cleanCode.setNumPags(464);
        cleanCode.setFormato("PDF");
        cleanCode.setTamanoMB(5.6);

        central.addLibro(quijote);
        central.addLibro(cleanCode);

        SalaLectura salaLectura = new SalaLectura();
        salaLectura.setNombre("Sala de Lectura Adultos");
        salaLectura.setCapacidad(20);
        salaLectura.setDisponibleReserva(true);
        salaLectura.addLibro(quijote);

        SalaEstudio salaEstudio = new SalaEstudio();
        salaEstudio.setNombre("Sala de Estudio 1");
        salaEstudio.setCapacidad(30);
        salaEstudio.setPizarra(true);
        salaEstudio.setDisponibleReserva(true);
        salaEstudio.setNumMesas(15);

        SalaInformatica salaInformatica = new SalaInformatica();
        salaInformatica.setNombre("Sala TIC");
        salaInformatica.setCapacidad(16);
        salaInformatica.setDisponibleReserva(false);
        salaInformatica.setNumEquipos(12);

        central.addSala(salaLectura);
        central.addSala(salaEstudio);
        central.addSala(salaInformatica);

        Usuario usuarioAna = new Usuario();
        usuarioAna.setNombre("Ana");
        usuarioAna.setApellidos("López Martín");
        usuarioAna.setEdad(25);
        usuarioAna.setDni("12345678A");
        usuarioAna.setEmail("ana@example.com");
        usuarioAna.setNumSocio("U-001");
        usuarioAna.prestarLibro(quijote);
        salaLectura.entrarPersona(usuarioAna);
        central.registrarVisita(usuarioAna);

        Usuario usuarioLuis = new Usuario();
        usuarioLuis.setNombre("Luis");
        usuarioLuis.setApellidos("Santos Ruiz");
        usuarioLuis.setEdad(19);
        usuarioLuis.setDni("98765432L");
        usuarioLuis.setEmail("luis@example.com");
        usuarioLuis.setNumSocio("U-002");
        usuarioLuis.prestarLibro(cleanCode);
        salaEstudio.entrarPersona(usuarioLuis);
        central.registrarVisita(usuarioLuis);

        Empleado coordinadora = new Empleado();
        coordinadora.setNombre("Laura");
        coordinadora.setApellidos("Díaz Pérez");
        coordinadora.setEdad(34);
        coordinadora.setDni("11223344P");
        coordinadora.setEmail("laura@example.com");
        coordinadora.setPuesto("Coordinadora");
        coordinadora.setSueldo(24500);

        Empleado tecnico = new Empleado();
        tecnico.setNombre("Miguel");
        tecnico.setApellidos("Romero Gil");
        tecnico.setEdad(28);
        tecnico.setDni("66554433M");
        tecnico.setEmail("miguel@example.com");
        tecnico.setPuesto("Técnico TIC");
        tecnico.setSueldo(22000);

        central.registrarVisita(coordinadora);
        central.registrarVisita(tecnico);

        central.asignarResponsable(salaLectura, coordinadora);
        central.asignarResponsable(salaEstudio, coordinadora);
        central.asignarResponsable(salaInformatica, tecnico);

        central.mostrarInformacion();

    }
}
