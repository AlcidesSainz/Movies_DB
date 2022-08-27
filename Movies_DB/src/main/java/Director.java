public class Director {
    int iddirector;
    String dir_name;
    public Director(){

    }

    public Director(int iddirector, String dir_name) {
        this.iddirector = iddirector;
        this.dir_name = dir_name;
    }

    public int getIddirector() {

        return iddirector;
    }

    public void setIddirector(int iddirector) {
        this.iddirector = iddirector;
    }

    public String getDir_name() {
        return dir_name;
    }

    public void setDir_name(String dir_name) {
        this.dir_name = dir_name;
    }
}
