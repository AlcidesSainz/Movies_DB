import java.util.Scanner;

public class FilmService {
    public static void crearDirector( ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese al director: ");
        String director = sc.nextLine();

        Director new_director = new Director();
        new_director.setDir_name(director);
        FilmDAO.crearDirectorDB(new_director);
    }
    public static void crearGenre( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el genero: ");
        String genre = sc.nextLine();

        Genre new_genre = new Genre();
        new_genre.setGenre(genre);
        FilmDAO.crearGenreDB(new_genre);
    }
    public static void crearFilm( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la pelicula: ");
        String movie = sc.nextLine();
        System.out.println("Ingresa el ID del director: ");
        int id_director = sc.nextInt();
        System.out.println("Ingresa el año de la pelicula: ");
        int year_movie = sc.nextInt();
        System.out.println("Ingresa su calificacion en IMDB: ");
        float rating_imdb = sc.nextFloat();
        System.out.println("Ingrese su ID de genero: ");
        int id_genre = sc.nextInt();
        System.out.println("Ingrese si ha visto la pelicula(1=YES/0=NO): ");
        int viewed = sc.nextInt();

        Film new_movie = new Film();
        new_movie.setMovie_name(movie);
        new_movie.setDirector_id(id_director);
        new_movie.setPremiere_year(year_movie);
        new_movie.setRating_imdb(rating_imdb);
        new_movie.setGenre_id(id_genre);
        new_movie.setViewed(viewed);
        FilmDAO.crearFilmDB(new_movie);
    }
    public static void leerDirector(){
        FilmDAO.leerDirectorDB();
    }
    public static void leerGenre(){
        FilmDAO.leerGenreDB();
    }
    public static void leerFilm(){
        FilmDAO.leerFilmDB();

    }
    public static void borrarDirector( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el ID del director que se desea eliminar: ");
        int iddirector = sc.nextInt();
        FilmDAO.borrarDirectorDB(iddirector);
    }
    public static void borrarGenre( ){
         Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el ID del genero que se desea eliminar: ");
        int idgenre = sc.nextInt();

        FilmDAO.borrarGenreDB(idgenre);
    }
    public static void borrarFilm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el ID de la pelicula que se desea eliminar: ");
        int id_movie = scanner.nextInt();
        FilmDAO.borrarFilmDB(id_movie);

    }
    public static void actualizarDirector(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nuevo director: ");
        String name_director = sc.nextLine();

        System.out.println("Ingresa el ID del director que desea editar");
        int id_director = sc.nextInt();

        Director new_director = new Director();
        new_director.setIddirector(id_director);
        new_director.setDir_name(name_director);
        FilmDAO.actualizarDirectorDB(new_director);

    }
    public static void actualizarGenre(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nuevo genero: ");
        String new_genre = sc.nextLine();

        System.out.println("Ingresa el ID del genero que se desea editar: ");
        int id_genre = sc.nextInt();

        Genre genre = new Genre();
        genre.setIdgenre(id_genre);
        genre.setGenre(new_genre);
        FilmDAO.actualizarGenreDB(genre);

    }
    public static void actualizarFilm(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la nueva pelicula: ");
        String new_movie = sc.nextLine();
        System.out.println("Ingresa el ID del director: ");
        int new_iddirector = sc.nextInt();
        System.out.println("Ingresa el año: ");
        int new_year = sc.nextInt();
        System.out.println("Ingresa su calificacion: ");
        float new_rating = sc.nextFloat();
        System.out.println("Ingresa el ID del genero: ");
        int new_idgenre = sc.nextInt();
        System.out.println("Vista?(Yes=1/No = 0)");
        int new_viewed = sc.nextInt();
        System.out.println("Inserte el ID de la pelicula que desea modificar: ");
        int new_id = sc.nextInt();

        Film film = new Film();
        film.setId_movies(new_id);
        film.setMovie_name(new_movie);
        film.setDirector_id(new_iddirector);
        film.setPremiere_year(new_year);
        film.setRating_imdb(new_rating);
        film.setGenre_id(new_idgenre);
        film.setViewed(new_viewed);
        FilmDAO.actualizarFilmDB(film);

    }


}
