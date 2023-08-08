
package controlempresas.entidadesdenegocio;

public class Empresa {
    private int id;
    private int IdContacto;
    private String nombre;
    private String rubro;
    private String categoria;
    private  String departamento;
    private int top_aux;
    private Contacto contacto;

    public Empresa() {
    }

    public Empresa(int id, int IdContacto, String nombre, String rubro, String categoria, String departamento, int top_aux, Contacto contacto) {
        this.id = id;
        this.IdContacto = IdContacto;
        this.nombre = nombre;
        this.rubro = rubro;
        this.categoria = categoria;
        this.departamento = departamento;
        this.top_aux = top_aux;
        this.contacto = contacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdContacto() {
        return IdContacto;
    }

    public void setIdContacto(int IdContacto) {
        this.IdContacto = IdContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    
    
    
}
