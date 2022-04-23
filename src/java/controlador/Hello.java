/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author casa
 */
@Named(value = "hello")
@RequestScoped
public class Hello {
/* 
Si no se especifica ningún nombre en la anotación @Named del managed bean, 
siempre se accede al managed bean con la primera letra del nombre de la clase en minúsculas.
Los ámbitos más utilizados en las aplicaciones JavaServer Faces son los siguientes:
Request(Solicitud) (@RequestScoped): RequestScoped persiste durante una sola solicitud HTTP en una aplicación web. 
En una aplicación como hello1, en la que la aplicación consta de una única solicitud y respuesta, 
el bean utiliza el ámbito de solicitud.
Session(Sesion) (@SessionScoped): SessionScoped persiste en varias solicitudes HTTP en una aplicación web. 
Cuando una aplicación consta de varias solicitudes y respuestas en las que es necesario mantener los datos,
los beans utilizan el ámbito de la sesión.
Application (@ApplicationScoped): Application scope persiste en todas las interacciones de los usuarios con una aplicación web.
*/
    private String name;

    public Hello() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
