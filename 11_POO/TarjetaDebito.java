public class TarjetaDebito {
    String propietario;
    String numero;
    String banco;
    int dineroDisponible;
    int permitidoRetiro;
    String ultimasTransacciones [];
    String clave;
    String estado;
    
    public TarjetaDebito(String propietario, String numero, String banco, int dineroDisponible, int permitidoRetiro, String clave, String estado ){
        this.propietario = propietario;
        this.numero = numero;
        this.banco = banco;
        this.dineroDisponible = dineroDisponible;
        this.permitidoRetiro = permitidoRetiro;
        this.ultimasTransacciones = new String[5];
        this.clave = clave;
        this.estado = "ACTIVO";

    }

    public void registrarTransaccion(String tipo, int monto, String estado){

    }

    public void verHistorial(String pass){
        registrarTransaccion(pass, dineroDisponible, pass);
        if ( pass.equals(clave)){

            for (int i=0; i<ultimasTransacciones.length; i++){
                if (ultimasTransacciones[i] != null){
                    System.out.println(" => "+ultimasTransacciones);
                }
            }
        }
    }

}







