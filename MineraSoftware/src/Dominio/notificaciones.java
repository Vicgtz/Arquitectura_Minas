/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;



/**
 *
 * @author DELL
 */
public class notificaciones {
    
    private Integer id;
    private vehiculo vehiculo;
    private String mensaje;
    private Usuario destinatario;
    private String clave;
    private Semaforo semaforo;

    public notificaciones(Integer id, vehiculo vehiculo, String mensaje, Usuario destinatario, String clave, Semaforo semaforo) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.clave = clave;
        this.semaforo = semaforo;
    }

    public notificaciones(Integer id, vehiculo vehiculo, String mensaje, Usuario destinatario, String clave) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.clave = clave;
    }

    public notificaciones(Integer id) {
        this.id = id;
    }

   
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public String toString() {
        return "notificaciones{" + "id=" + id + ", vehiculo=" + vehiculo + ", mensaje=" + mensaje + ", destinatario=" + destinatario + ", clave=" + clave + ", semaforo=" + semaforo + '}';
    }
    
    
    
    
    
}
