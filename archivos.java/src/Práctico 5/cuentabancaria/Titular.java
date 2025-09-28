
package cuentabancaria;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentaBancaria = null;
    }
    public String getNombre() { 
        return nombre; 
    }
    public String getDni() { 
        return dni; 
    }        
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }   
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
}

