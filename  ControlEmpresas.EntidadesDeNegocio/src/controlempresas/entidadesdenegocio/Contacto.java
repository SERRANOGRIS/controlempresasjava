package controlempresas.entidadesdenegocio;
import java.util.ArrayList;


public class Contacto {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private String celular;
    private int top_aux;
    private ArrayList<Empresa>empresa;

    public Contacto() {
    }

    public Contacto(int id, String nombre, String email, String telefono, String celular, int top_aaux, ArrayList<Empresa> empresa) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.top_aux = top_aaux;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getTop_aaux() {
        return top_aux;
    }

    public void setTop_aaux(int top_aaux) {
        this.top_aux = top_aaux;
    }

    public ArrayList<Empresa> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<Empresa> empresa) {
        this.empresa = empresa;
    }

    public int getTop_aux() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
