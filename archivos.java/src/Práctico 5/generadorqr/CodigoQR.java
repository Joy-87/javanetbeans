
package generadorqr;

public class CodigoQR {
    private String valor;
    private Usuario usuario; 

    // El constructor recibe el Usuario para establecer la Asociación
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
        System.out.println("  [Código QR creado] Valor: " + valor);
        System.out.println("  Asociado al usuario: " + usuario.getNombre());
    }
    public String getValor() { 
        return valor; 
    }
    public Usuario getUsuario() { 
        return usuario; 
    }
}

