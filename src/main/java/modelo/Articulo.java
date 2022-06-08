/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Articulo {
    String titulo;
    int numeroPalabras; //maximo 
    int limitePalabras;
    int yearPublicacion;
    Revista revista;
    AutorPrincipal autor;
    public boolean verificarNumeroPalabras(){ 
        var retorno=false;
        if(this.numeroPalabras>=0 && this.numeroPalabras<=limitePalabras){
                retorno=true; 
        }
        return retorno ;   
    }
    public String verificarFecha(){
     var retorno= " ";
      if (this.yearPublicacion>=2015 && this.yearPublicacion<= 2022){  
          retorno= " Publicacion Actual"; 
      }else if (this.yearPublicacion>=2010 && this.yearPublicacion<=2015){
          retorno= "Publicacion Antigua";
      }
        return retorno;   
    }   
  
}
