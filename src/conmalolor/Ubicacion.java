/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor;

/**
 *
 * @author joel
 */
public class Ubicacion {

    private String provincia;
    private String direccion;
    private String pais;
    private String ciudad;

    public Ubicacion(String provincia, String direccion, String pais, String ciudad) {
        this.provincia = provincia;
        this.direccion = direccion;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString(){
        String dir = pais + " - " + provincia + " - " + ciudad;
        return  dir+ "\n" + direccion;
    }
    
}
