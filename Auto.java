
public class Auto {

    private String Placa;
    private int DiasDesdeUltimoMantenimiento;
    private boolean TieneSeguro;

    public Boolean NecesitaMantenimiento() {
        if (DiasDesdeUltimoMantenimiento >= 20) {
            return false;
        }else{
        return true;    
        }        
    }

    public boolean SePuedeRentar() {             
        if (TieneSeguro == true && DiasDesdeUltimoMantenimiento >= 20) {
        return true;
        }else{
        return false;    
        }           
    }     

    public Auto(String Placa, int DiasDesdeUltimoMantenimiento, boolean TieneSeguro ) {        
    }
    
    
}
