/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refactorizado;

import java.util.List;




public class Example {
    public List<Cliente> clientes;
    public List<Employee> empleados;

    public void MostrarInformacion(Cliente cliente) {

        validarInformacion(cliente.getNombre(), cliente.getApellido(), cliente.getCedula());

        System.out.println("Nombre: " + cliente.Nombre + ", Apellido: " + cliente.Apellido + ", con numero de cedula: " + cliente.Cedula);
    }

    public void GuardarCliente(String Nombre, String Apellido, String Cedula) {

        validarInformacion(Nombre, Apellido, Cedula);

        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        this.clientes.add(cliente);
        System.out.println(Nombre + " " + Apellido + "ha sido agregado como nuevo cliente");

    }

    public void validarInformacion(String Nombre, String Apellido, String Cedula) {

        if (comparar(Nombre)) {
            System.out.println("ingreso de nombre incorrecto");
        } else {
            System.out.println("ingreso de nombre correcto");

        }
        if (comparar(Apellido)) {
            System.out.println("ingreso de apellido incorrecto");
        } else {
            System.out.println("ingreso de apellido correcto");

        }
        if (!compararCI(Cedula)) {
            System.out.println("ingreso de cedula incorrecto");
        } else {
            System.out.println("ingreso de cedula correcto");

        }

    }

    private boolean comparar(String datos) {
        if ("".equals(datos) && datos.length() > 16) {
            return true;
        }
        return false;
    }

    private boolean compararCI(String ci) {

        if ("".equals(ci) && ci.length() < 10) {
            return true;
        }
        return false;
    }
    
    
    
}
