/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class AutorPrincipal extends Articulo {
    String nombre;
    int yearNacimiento ;
    int edad;
    String ciudadania;
    Articulo articulo;
    
     public String verificarCiudadania(){
         var retorno="TBD";
        var ciudadaniaAutor=this.ciudadania.charAt(0);
        switch(ciudadaniaAutor)
        {
            case 'A':
                retorno="Alemania";
                break;
            case 'B':
                retorno="Bolivia";
                break;
            case 'C':
                retorno="Cuba";
                break;
            case 'H':
                retorno="Honduras";
                break;
            case 'M':
                retorno="Mexico";
                break;
            case 'P':
                retorno="Puerto Rico";
                break;    
      }
        return retorno;
     }
     
    public int calcularEdad(int yearActual){    
         var retorno= 100;
         retorno= yearActual-this.yearNacimiento;
         return retorno;
    }
}
