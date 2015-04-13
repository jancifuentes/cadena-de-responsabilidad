/**
 * La clase Unidad representa la clase abstracta manejadora 
 * de la cadena de responsabilidad.
 * El servicio delegado en la cadena es la solicitud de una 
 * orden al mando directo
 */
package cliente;

public abstract class Unidad {
   

public Unidad(String nombre) { 
        _mando = null; 
        _nombre = nombre;
    }
    public String toString() { return _nombre; }
 
    
 
    public void establecerMando(Unidad mando) { _mando = mando; }
 
    
 
    public String orden() {
        return (_mando != null ? _mando.orden() : "(sin orden)"); 
    }
 
    private Unidad _mando;
    private String _nombre;

}
