
package cuentabancaria;

public class CuentaBancaria {
     private String cbu;
    private String saldo;
    private ClaveSeguridad claveSeguridad; 
    private Titular titular;
    
    public CuentaBancaria(String cbu, String saldo, ClaveSeguridad claveSeguridad, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;           
        this.claveSeguridad = claveSeguridad;               
        this.titular = titular;        
        titular.setCuentaBancaria(this); 
    }    
    public String getCbu() { 
        return cbu;
    }
    public String getSaldo() {
        return saldo; 
    }
    public ClaveSeguridad getClaveSeguridad() { 
        return claveSeguridad;
    }
    public Titular getTitular() { 
        return titular; 
    }
}

