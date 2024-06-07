package Utils;

public class Digimon {
    private String id;
    private String nombre;
    private String url;
    private String imagen;
    private String[] levels; 
    private String[] attributes; 
    private String[] types; 

    public Digimon(String id, String nombre, String url, String imagen, String[] levels, String[] types, String[] attributes) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.imagen = imagen;
        this.levels = levels;
        this.types = types;
        this.attributes = attributes;
    }

    public String[] getLevels() {
        return levels;
    }

    public String[] getAttributes() {
        return attributes;
    }

    public String[] getTypes() {
        return types;
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

    

