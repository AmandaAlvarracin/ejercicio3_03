/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */

public class Revista {
    String nombre;
    String categoria;
    String edicion;
    String tipoRevista; 
    int revistasVendidas;

    public Revista(Integer valueOf, String param) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String validarCategorias(){
        var retorno="TBD";
        var categoriaRevista=this.categoria.charAt(0);
        switch(categoriaRevista)
        {
            case 'A':
                retorno="Todo Publico";
                break;
            case 'B':
                retorno="Solo niños";
                break;
            case 'C':
                retorno="Revista Cientifica";
                break;
            case 'T':
                retorno="Revista Tecnologica";
                break;
            case 'F':
                retorno="Farandula";
                break;
            case 'E':
                retorno="Revista educativa";
                break;
            default:
                retorno="Revista no disponible";
        }
        
        return retorno;  
     }
    public int precioRevista(){
        var retorno= 30  ;
        if (this.categoria=="Todo pubico");  
         retorno=5; 
         if (this.categoria=="Solo niños");  
           retorno=10;
         if (this.categoria=="Revista Científica");
           retorno= 25;
         if (this.categoria=="Revista Tecnológica");
           retorno= 20;
         if (this.categoria=="Farandula");
           retorno= 8;
         if (this.categoria=="Revista educativa");
           retorno= 15;
         
        return retorno;   
    }
}
