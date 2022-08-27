public class Film {
    int id_movies;
    String movie_name;
    int director_id;
    int premiere_year;
    float rating_imdb;
    int genre_id;
    int viewed;

    public Film(){

    }

    public Film(int id_movies, String movie_name, int director_id, int premiere_year, float rating_imdb, int genre_id, int viewed) {
        this.id_movies = id_movies;
        this.movie_name = movie_name;
        this.director_id = director_id;
        this.premiere_year = premiere_year;
        this.rating_imdb = rating_imdb;
        this.genre_id = genre_id;
        this.viewed = viewed;
    }

    public int getId_movies() {
        return id_movies;
    }

    public void setId_movies(int id_movies) {
        this.id_movies = id_movies;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public int getDirector_id() {
        return director_id;
    }

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
    }

    public int getPremiere_year() {
        return premiere_year;
    }

    public void setPremiere_year(int premiere_year) {
        this.premiere_year = premiere_year;
    }

    public float getRating_imdb() {
        return rating_imdb;
    }

    public void setRating_imdb(float rating_imdb) {
        this.rating_imdb = rating_imdb;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public int isViewed() {
        return viewed;
    }

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }
}