public class Genre {
    int idgenre;
    String genre;
    public Genre(){

    }

    public Genre(int idgenre, String genre) {
        this.idgenre = idgenre;
        this.genre = genre;
    }

    public int getIdgenre() {
        return idgenre;
    }

    public void setIdgenre(int idgenre) {
        this.idgenre = idgenre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
