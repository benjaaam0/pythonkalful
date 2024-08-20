/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeriaa;
/**
 *
 * @author W608-PCXX
 */
public class Pizzeriaa {

   
    public static void main(String[] args) {
    
        //Comentario
        //Instanciamos la clase pizza = creamos un objeto
        Pizza pizza1=new Pizza("Vegetariana","delgada","familiar",14990);
        Pizza pizza2=new Pizza();
        
        pizza2.setNombre("napolitana");
        pizza2.setMasa("gruesa");
        pizza2.setTamaño("indiviudla");
        pizza2.setPrecio(18000);
        
        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());
           
    }
    
}
