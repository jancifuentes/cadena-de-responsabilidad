/**
 * La clase Coronel modifica ligeramente el comportamiento por defecto de la cadena de
 * responsabilidad: si el coronel tiene una orden específica, utiliza ésta para resolver
 * el servicio. Si no tiene una orden específica (_orden==null), emplea el comportamiento
 * convencional de las unidades
 */
package cliente;

public class Coronel extends Unidad {

    
    public Coronel(String smith, String orden) {
        super(smith);
      _orden = orden;
    }
 
    
    public String orden()    { return (_orden != null ? _orden : super.orden()); }
 
  
    public String toString() { return ("Coronel " + super.toString()); }
 
    private final String _orden;
}
    
    
