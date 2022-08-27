import java.sql.Connection;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        principalMenu:
        do {
            System.out.println("-----------------");
            System.out.println("Menu Peliculas");
            System.out.println("1-Añadir");
            System.out.println("2-Mostrar");
            System.out.println("3-Editar");
            System.out.println("4-Borrar");
            System.out.println("5-Salir");
            //leer la opcion del usuario
            System.out.println("Ingrese la opcion deseada: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    do {
                        System.out.println("______________");
                        System.out.println("Añadir");
                        System.out.println("1.Añadir Pelicula:");
                        System.out.println("2.Añadir Director: ");
                        System.out.println("3.Añadir Genero: ");
                        System.out.println("4.Atras");
                        opcion = sc.nextInt();
                        switch (opcion){
                            case 1:
                                FilmService.crearFilm();
                                break;
                            case 2:
                                FilmService.crearDirector();
                                break;
                            case 3:
                                FilmService.crearGenre();
                                break;
                            case 4:
                             continue principalMenu;
                            default:
                                break;
                        }
                    }while (opcion!=4);
                    break;
                case 2:
                    do {
                        System.out.println("______________");
                        System.out.println("Mostrar");
                        System.out.println("1.Mostrar Pelicula:");
                        System.out.println("2.Mostrar Director: ");
                        System.out.println("3.Mostrar Generos: ");
                        System.out.println("4.Atras");
                        opcion = sc.nextInt();
                        switch (opcion){
                            case 1:
                                FilmService.leerFilm();
                                break;
                            case 2:
                                FilmService.leerDirector();
                                break;
                            case 3:
                                FilmService.leerGenre();
                                break;
                            case 4:
                                continue principalMenu;
                            default:
                                break;

                        }
                    }while (opcion!=4);
                    break;
                case 3:
                    do {
                        System.out.println("______________");
                        System.out.println("Editar");
                        System.out.println("1.Modificar Pelicula:");
                        System.out.println("2.Modificar Director: ");
                        System.out.println("3.Modificar Genero: ");
                        System.out.println("4.Atras");
                        opcion = sc.nextInt();
                        switch (opcion){
                            case 1:
                                FilmService.actualizarFilm();
                                break;
                            case 2:
                                FilmService.actualizarDirector();
                                break;
                            case 3:FilmService.actualizarGenre();
                                break;
                            case 4:
                                continue principalMenu;
                            default:
                                break;
                        }
                    }while (opcion!=4);
                    break;
                case 4:
                    do {
                        System.out.println("______________");
                        System.out.println("Eliminar");
                        System.out.println("1.Eliminar Pelicula:");
                        System.out.println("2.Eliminar Director: ");
                        System.out.println("3.Eliminar Genero: ");
                        System.out.println("4.Atras");
                        opcion = sc.nextInt();
                        switch (opcion){
                            case 1:
                                FilmService.borrarFilm();
                                break;
                            case 2:
                                FilmService.borrarDirector();
                                break;
                            case 3:
                                FilmService.borrarGenre();
                                break;
                            case 4:
                                continue principalMenu;
                            default:
                                break ;
                        }
                    }while (opcion!=4);
                    break;
            }
        }while (opcion!=5);

        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
