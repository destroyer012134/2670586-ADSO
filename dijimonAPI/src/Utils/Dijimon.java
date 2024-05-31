package Utils;

public class Dijimon {
    private String id;
    private String nombre;
    private String url;
    private String imagen;

    public Dijimon(String id, String nombre, String url, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.imagen = imagen;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public String getImagen() {
        return imagen;
    }
}

