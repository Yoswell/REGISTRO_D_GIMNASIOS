package proyecto_n1;

public class RegistrarGS {
    
    public int id;
    public String nombre;
    public int canMaquinas;
    public boolean cross;
    public int canClientes;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCanMaquinas() { return canMaquinas; }

    public void setCanMaquinas(int canMaquinas) { this.canMaquinas = canMaquinas; }

    public boolean getCross() { return cross; }

    public void setCross(boolean cross) { this.cross = cross; }

    public int getCanClientes() { return canClientes; }

    public void setCanClientes(int canClientes) { this.canClientes = canClientes; }
    
    
    public RegistrarGS(int Id, String Nombre, int CanMaquinas, boolean Cross, int CanClientes) {
        this.id = Id;
        this.nombre = Nombre;
        this.canMaquinas = CanMaquinas;
        this.cross = Cross;
        this.canClientes = CanClientes;
    } 
 
}
