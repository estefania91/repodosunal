
package sem2;


public class EjecucionMascota {
    
    public static void main(String[] args) {
        
        Mascota mascota = new Mascota("femenino", 15.14);
        //Mascota mascota = new Mascota("Criollo", "Multicolor", "Macho", 13.4);
        //System.out.println("Mascota tamaño ="+mascota.tamano()); cuando es publico
        System.out.println("Mascota tamaño= "+mascota.getTamano());
        mascota.comer("Vegetales");
        System.out.println("Mascota sexo= "+mascota.getSexo());
        System.out.println("Mascota raza= "+mascota.getRaza());
        System.out.println("Mascota color= "+mascota.getColor());
        
        mascota.setRaza("Pastor Aleman");
        System.out.println("Mascota raza= "+mascota.getRaza());
        
        
    }
}
