
package sem2;

public class SEM2 {

    public static void main(String[] args) {
      //gatos.mascota("persa");
      Mascota mascota=new Mascota("femenino", 15.14);
      System.out.println("Mascota tamaño = "+mascota.getTamano());
      mascota.comer("Vegetales");
      mascota.setRaza("Pastor Aleman");
      System.out.println("Mascota tamaño = "+mascota.getRaza());
      
    }
          
}
