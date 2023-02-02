public class Cancion
{
    private String nombre;
    private String autor;
    private PlayList playlist;

    /**
     * Constructor for objects of class PlayList
     */
    public Cancion(String nombre, String autor, PlayList playlist)
    {
        this.autor = autor;
        this.nombre = nombre;
        this.playlist = playlist;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public PlayList getPlayList(){
        return playlist;
    }
}