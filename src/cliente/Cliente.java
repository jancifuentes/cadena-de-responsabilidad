
package cliente;


public class Cliente {

    
    public static void main(String[] argv) {
      Unidad smith  = new Coronel("Smith", null);
      Unidad truman = new Coronel("Truman", "Tomar posición enemiga");
      Unidad ryan   = new Soldado("Ryan");
      Unidad rambo  = new Soldado("Rambo");
 
      System.out.println(rambo.orden());    
 
      rambo.establecerMando(truman);
      System.out.println(rambo.orden());    
 
      ryan.establecerMando(rambo);
      System.out.println(ryan.orden());     
    }
}

