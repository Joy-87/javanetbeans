package main;

public class Main {
    public static void main(String[] args) {
        Titular titular1 = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte1 = new Pasaporte("P001", "18/09/2025", titular1, "foto_juan.jpg", "JPEG");

        System.out.println("Datos del Pasaporte:");
        System.out.println("  Número: " + pasaporte1.getNumero());
        System.out.println("  Fecha de Emisión: " + pasaporte1.getFechaEmision());
        System.out.println("  Formato de la Foto: " + pasaporte1.getFoto().getFormato());
        System.out.println("---");

        System.out.println("Datos del Titular:");
        System.out.println("  Nombre: " + titular1.getNombre());
        System.out.println("  DNI: " + titular1.getDni());
        System.out.println("  Número de Pasaporte (desde el Titular): " + titular1.getPasaporte().getNumero());
    }
}
