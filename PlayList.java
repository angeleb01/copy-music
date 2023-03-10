public class PlayList
{
    private int idPlayList;
    private String nombre;
    /**
     * Constructor for objects of class PlayList
     */
    public PlayList(int idPlayList, String nombre)
    {
        this.idPlayList = idPlayList;
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setIdPlayList(int idPlayList){
        this.idPlayList = idPlayList;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getIdPlayList(){
        return idPlayList;
    }
    
     public void imprimirDetalles(){
        System.out.println("Esta es la id de la playlist: " + idPlayList);
        System.out.println("Este es el nombre de la cancion: " + nombre);
    }
}