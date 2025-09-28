
package impuestos;

public class Impuestos {
    private double monto;
    private Contribuyente contribuyente; 

    public Impuestos(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    public double getMonto() { 
        return monto; 
    }
    public Contribuyente getContribuyente() { 
        return contribuyente; 
    }
}

