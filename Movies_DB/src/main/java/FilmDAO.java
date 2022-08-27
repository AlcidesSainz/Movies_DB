import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmDAO {
    //Metodo para crear director
    public static void crearDirectorDB(Director director) {
    Conexion db_connect = new Conexion();

    try (Connection conexion = db_connect.get_connection()){
        PreparedStatement ps = null;
        try{
            String query = "INSERT INTO `movies_db`.`director` (`dir_name`) VALUES (?)";
            ps = conexion.prepareStatement(query);
            ps.setString(1,director.getDir_name());
            ps.executeUpdate();
            System.out.println("Director Añadido con exito");
        }catch (SQLException e){
            System.out.println(e);
        }
    } catch (SQLException e) {
        System.out.println(e);
        }
    }
    //Metodo para crear un genero
    public static void crearGenreDB(Genre genre){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO `movies_db`.`genre` (`genre`) VALUES (?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,genre.getGenre());
                ps.executeUpdate();
                System.out.println("Genero Añadido con Exito");

            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void crearFilmDB(Film film){
    Conexion db_connect = new Conexion();

    try(Connection conexion = db_connect.get_connection()){
        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO `movies_db`.`film` (`movie_name`, `director_id`, `premiere_year`, `rating_imdb`, `genre_id`, `viewed`) VALUES (?, ?, ?, ?, ?, ?)";
            ps = conexion.prepareStatement(query);
            ps.setString(1, film.movie_name);
            ps.setInt(2,film.director_id);
            ps.setInt(3,film.premiere_year);
            ps.setFloat(4,film.rating_imdb);
            ps.setInt(5,film.genre_id);
            ps.setInt(6,film.viewed);
            ps.executeUpdate();
            System.out.println("Pelicula Añadido con Exito");
        }catch (SQLException e){
            System.out.println(e);
        }
    }catch (SQLException e){
        System.out.println(e);
    }
    }
    public static void leerDirectorDB(){
    Conexion db_connect = new Conexion();
    try(Connection conexion = db_connect.get_connection()){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM movies_db.director";
                    ps = conexion.prepareStatement(query);
                    rs = ps.executeQuery();

                    while (rs.next()){
                        System.out.println("ID: "+rs.getInt("iddirector"));
                        System.out.println("Director: "+rs.getString("dir_name"));
                    }
        }catch (SQLException e){
            System.out.println(e);
        }
    }catch (SQLException e){
        System.out.println(e);
    }
    }
    public static void leerGenreDB(){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;
            ResultSet rs = null;
            try {
                String query = "SELECT * FROM movies_db.genre";
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()){
                    System.out.println("ID: "+rs.getInt("idgenre"));
                    System.out.println("Genero: "+rs.getString("genre"));
                }
                } catch (SQLException e) {
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerFilmDB(){
        Conexion db_connect = new Conexion();
        Connection conexion = db_connect.get_connection();
        PreparedStatement ps = null;
        ResultSet rs = null;
            try {
                String query = "SELECT * FROM movies_db.film";
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()){
                    System.out.println("________________________________________");
                    System.out.println("ID: "+rs.getInt("idmovies"));
                    System.out.println("Pelicula: "+rs.getString("movie_name"));
                    System.out.println("Director: "+rs.getString("director_id"));
                    System.out.println("Año: "+rs.getInt("premiere_year"));
                    System.out.println("Calificacion: "+rs.getFloat("rating_imdb"));
                    System.out.println("Genero: "+rs.getInt("genre_id"));
                    System.out.println("Vista?: "+rs.getInt("viewed"));
                }
            }catch (SQLException e){
                System.out.println(e);
            }
        }
    public static void borrarDirectorDB(int iddirector ){
        Conexion db_connect = new Conexion();
        Connection conexion = db_connect.get_connection();
        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM `movies_db`.`director` WHERE (`iddirector` = ?)";
            ps = conexion.prepareStatement(query);
            ps.setInt(1,iddirector);
            ps.executeUpdate();
            System.out.println("Director eliminado con exito");
        }catch (SQLException e){
            System.out.println(e);
            System.out.println("Error al eliminar el director");
        }
    }
    public static void borrarGenreDB(int idgenre){
    Conexion db_connect = new Conexion();
        Connection conexion = db_connect.get_connection();
        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM `movies_db`.`genre` WHERE (`idgenre` = ?)";
            ps = conexion.prepareStatement(query);
            ps.setInt(1,idgenre);
            ps.executeUpdate();
            System.out.println("Genero Eliminado con exito");
        }catch (SQLException e){
            System.out.println(e);
            System.out.println("Error al eliminar el genero");
        }
    }
    public static void borrarFilmDB(int id_movies){
        Conexion db_connect = new Conexion();
        Connection conexion = db_connect.get_connection();
        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM `movies_db`.`film` WHERE (`idmovies` = ?)";
            ps = conexion.prepareStatement(query);
            ps.setInt(1,id_movies);
            ps.executeUpdate();
            System.out.println("Pelicula Eliminada con exito");
        }catch (SQLException e){
            System.out.println(e);
            System.out.println("Error al eliminar la pelicula");
        }

    }
    public static void actualizarDirectorDB(Director director ){
    Conexion db_connect = new Conexion();
    Connection conexion = db_connect.get_connection();
    PreparedStatement ps = null;
    try {
        String query = "UPDATE `movies_db`.`director` SET `dir_name` = ? WHERE (`iddirector` = ?)";
        ps = conexion.prepareStatement(query);
        ps.setString(1,director.getDir_name());
        ps.setInt(2,director.getIddirector());
        ps.executeUpdate();
        System.out.println("Director Actualizado con Exito");
    }catch (SQLException e){
        System.out.println(e);
        System.out.println("Error al momento de actualizar el director");
    }
    }
    public static void actualizarGenreDB(Genre genre){
        Conexion db_connect = new Conexion();
        Connection conexion = db_connect.get_connection();
        PreparedStatement ps = null;
        try {
            String query = "UPDATE `movies_db`.`genre` SET `genre` = ? WHERE (`idgenre` = ?)";
            ps = conexion.prepareStatement(query);
            ps.setString(1,genre.getGenre());
            ps.setInt(2,genre.getIdgenre());
            ps.executeUpdate();
            System.out.println("Genero Actualizado con Exito");
        }catch (SQLException e){
            System.out.println(e);
            System.out.println("Error al momento de actualizar el genero");
        }

    }
    public static void actualizarFilmDB(Film film){
        Conexion db_connect = new Conexion();
        Connection conexion = db_connect.get_connection();
        PreparedStatement ps = null;
        try {
            String query = "UPDATE `movies_db`.`film` SET `movie_name` = ?,director_id = ?, premiere_year = ?, rating_imdb = ?, genre_id = ?, viewed = ? WHERE (`idmovies` = ?)";
            ps = conexion.prepareStatement(query);
            ps.setString(1, film.movie_name);
            ps.setInt(2,film.director_id);
            ps.setInt(3,film.premiere_year);
            ps.setFloat(4,film.rating_imdb);
            ps.setInt(5,film.genre_id);
            ps.setInt(6,film.viewed);
            ps.setInt(7,film.id_movies);
            ps.executeUpdate();
            System.out.println("Mensaje actualizado con exito");

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
