/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Administrador
 */
@Named(value = "login")
@RequestScoped
public class login {

    /**
     * Creates a new instance of login
     */
    
    private String nombre;
    private String pass;
    
    public login() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
