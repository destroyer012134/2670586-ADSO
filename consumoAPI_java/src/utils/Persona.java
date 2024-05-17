package utils;



public class Persona {
    
    String cedula; 
    String nombres; 
    String apellidos; 
    String telefono;
    String direccion; 
    String email;
    String foto = "";

    public Persona(String cedula, String nombres, String apellidos, String telefono, String direccion, String email) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public String getNombres() {
    return nombres;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFoto() {
        return foto;
    }
    
    
    //SETTERS

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
    
    

 
    
    
    
    
    
    
}
