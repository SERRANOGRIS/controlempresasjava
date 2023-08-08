
package controlempresas.entidadesdenegocio;

import java.time.LocalDate;

public class Usuario {
     private int id;
    private int IdRol;
    private String nombre;
    private String apellido;
    private String login;
    private  String password;
    private byte estatus;
    private LocalDate fechaRegistro;
    private int top_aux;
    private String confirmarPassword_aux;
    private Rol rol;

    public Usuario() {
    }

    public Usuario(int id, int IdRol, String nombre, String apellido, String login, String password, byte estatus, LocalDate fechaRegistro, int top_aux, String confirmarPassword_aux, Rol rol) {
        this.id = id;
        this.IdRol = IdRol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.login = login;
        this.password = password;
        this.estatus = estatus;
        this.fechaRegistro = fechaRegistro;
        this.top_aux = top_aux;
        this.confirmarPassword_aux = confirmarPassword_aux;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getEstatus() {
        return estatus;
    }

    public void setEstatus(byte estatus) {
        this.estatus = estatus;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public String getConfirmarPassword_aux() {
        return confirmarPassword_aux;
    }

    public void setConfirmarPassword_aux(String confirmarPassword_aux) {
        this.confirmarPassword_aux = confirmarPassword_aux;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    

}
