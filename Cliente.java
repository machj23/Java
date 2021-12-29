public class Cliente {
    private String Cedula;    
    private int Edad;
    private String Nombre;
    
    private String cedula;
    private int edad;
    private String nombre;

public Cliente(String cedula, int edad, String nombre){
    this.Cedula = cedula;
    this.Edad = edad;
    this.Nombre = nombre;
}

public String getCedula(){    
    return cedula;
}
public int getEdad(){    
    return edad;
}

public String getNombre(){    
    return nombre;    
}

}