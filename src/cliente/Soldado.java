/**
 * Esta clase es una extensión instanciable de la superclase Unidad que respeta el
 * comportamiento por defecto de la cadena de responsabilidad
 */
package cliente;


public class Soldado extends Unidad {
    
    public Soldado(String ryan) {
        super(ryan);
    }
 
    public String toString() { return ("Soldado " + super.toString()); }
}
    
