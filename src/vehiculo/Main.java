
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoRamosQuirantePrudencio2223 miVehiculoRamosQuirantePrudencio2223;
        int stockActual;
        
        miVehiculoRamosQuirantePrudencio2223 = new VehiculoRamosQuirantePrudencio2223("Seat",18000,100);
        
        operativaVehiculosRamosQuirantePrudencio2223(miVehiculoRamosQuirantePrudencio2223, 50); 
        
        stockActual = miVehiculoRamosQuirantePrudencio2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void operativaVehiculosRamosQuirantePrudencio2223(VehiculoRamosQuirantePrudencio2223 miVehiculoRamosQuirantePrudencio2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoRamosQuirantePrudencio2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoRamosQuirantePrudencio2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
