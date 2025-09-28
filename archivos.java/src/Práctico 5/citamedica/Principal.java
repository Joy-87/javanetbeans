
package citamedica;

public class Principal {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Ana González", "Osde 210");
        Profesional profesional = new Profesional("Dr. Ricardo Méndez", "Cardiología");
        CitaMedica cita = new CitaMedica("27/09/2025", "10:30", paciente, profesional);
        
        System.out.println("--- Cita Médica Creada ---");
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        
        System.out.println("\n--- Datos del Paciente ---");
        System.out.println("Nombre del Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Obra Social: " + cita.getPaciente().getObraSocial());
        
        System.out.println("\n--- Datos del Profesional ---");
        System.out.println("Nombre del Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Especialidad: " + cita.getProfesional().getEspecialidad());
    }
}
    
    

