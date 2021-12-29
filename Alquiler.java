import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Alquiler {
    private Cliente Cliente;
    private Auto Auto;
    private LocalDate Fecha;
    private int HoraslAlquiler;
   
    public Alquiler(Cliente cliente, Auto auto, LocalDate fecha, int horaslAlquiler){
        this.Cliente = cliente;
        this.Auto = auto;
        this.Fecha = fecha;
        this.HoraslAlquiler = horaslAlquiler;             
    }
    
   
    public  Cliente getCliente(){        
        return Cliente;
    }
    
    public  Auto getAuto(){
        return Auto;        
    }
    
    public  LocalDate getFecha(){        
        return Fecha;
    }
    
    public  int getHoraslAlquiler(){        
        return HoraslAlquiler;        
    }
    
    public int ObtenerDescuento(Alquiler[]alquileres){
       int acumulacion=0;
       long numerofecha=0;
       boolean aplicaDescuento;
       if (this.getAuto().NecesitaMantenimiento()==false && this.getAuto().SePuedeRentar()== true){
           for(int run=0;run<alquileres.length;run++){
               numerofecha=ChronoUnit.DAYS.between(alquileres[run].Fecha, this.Fecha);                
                acumulacion=acumulacion+alquileres[run].HoraslAlquiler;
                if (acumulacion <20){
            }return 0;
           }
       }
        acumulacion=acumulacion+this.HoraslAlquiler;
        if(acumulacion>50){
           aplicaDescuento=true;
           return 5;
        }   
        acumulacion=acumulacion+this.HoraslAlquiler;
        if(acumulacion>=50 && acumulacion >= 20){
           aplicaDescuento=true;
           return 5;
       }return 0;
       
    }
    
    
    public double CalcularCosto(boolean aplicaDescuento){
        double costoHoraAlquiler=5000.0;        
        if (aplicaDescuento == true){
            double costoFinal = this.HoraslAlquiler*costoHoraAlquiler;            
            long costoDescuento = (long) (costoFinal*2/100);
            return costoFinal-costoDescuento;
    }
    return 0.0;    
    }
    
    public static boolean puedeAlquilar(Alquiler[] historial,Cliente cliente ){
        for(int j=0;j<historial.length;j++){
        }    
        return false;
    }
}