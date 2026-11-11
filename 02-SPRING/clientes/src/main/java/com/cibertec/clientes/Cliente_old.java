package com.cibertec.clientes;

public class Cliente_old {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;

    public Cliente_old(){}
    public Cliente_old(Long id, String nombre, String apellido, String email) {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
