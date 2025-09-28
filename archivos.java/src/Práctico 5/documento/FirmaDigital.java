
package documento;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // REFERENCIA para la Agregación

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; // Asocia al Usuario (Agregación)
    }
    
    public String getCodigoHash() { 
        return codigoHash; 
    }
    public String getFecha() { 
        return fecha; 
    }
    public Usuario getUsuario() { 
        return usuario; 
    }
}

