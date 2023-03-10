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

    public void setAutor (String autorN) {
        autor = autorN;
    }

    public void setNombre (String nombreN) {
        nombre = nombreN;
    }

    public void setplaylist (PlayList playlistN) {
        playlist = playlistN;
    }

    public void imprimirDetalles(){
        System.out.println("Este es el nombre de la cancion " + nombre);
        System.out.println("Este es el nombre del Autor: " + autor);
        System.out.println("Este es el codigo de la playlist: " + playlist.getIdPlayList());
        System.out.println("Este es el nombre de la playlist: " + playlist.getNombre());
    }
}