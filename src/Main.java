import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        //declaracion de variables
        int opcion;

        do {try {

            //Menu
            System.out.println("Menu");
            System.out.println("1.- Insertar Valor al Inicio");
            System.out.println("2.- Eliminar Valor al inicio");
            System.out.println("3.- Buscar Valor");
            System.out.println("4.- Insertar Valor en Posicion");
            System.out.println("5.- Eliminar en posicion");
            System.out.println("6.- Mostrar Lista");
            System.out.println("7.- Eliminar Lista");
            System.out.println("8.- Salir");

            Scanner scanner = new Scanner(System.in);

            //Ingreso de opcion
            System.out.print("Seleccionar una funcion: ");
            opcion= scanner.nextInt();
            //Switch para seleccionar la opcion
            switch (opcion) {
                case 1:
                    System.out.print("Ingresar valor: ");
                    int valor = scanner.nextInt();
                    lista.insertarAlInicio(valor);
                    break;
                case 2:
                    lista.eliminarAlInicio();
                    break;
                case 3:
                    System.out.print("Ingresar valor a buscar: ");
                    int valorBusqueda = scanner.nextInt();
                    lista.busqueda(valorBusqueda);
                    break;
                case 4:
                    System.out.print("Ingresar valor: ");
                    int valorInsertar = scanner.nextInt();
                    System.out.print("Ingresar posicion: ");
                    int posicion = scanner.nextInt();
                    lista.insertarPocicion(valorInsertar, posicion);
                    break;
                case 5:
                    System.out.print("Ingresar posicion a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    lista.eliminarPocicion(posicionEliminar);
                    break;
                case 6:
                    lista.imprimir();
                    break;
                case 7:
                    lista.eliminar();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Favor ingrese solo numeros enteros");
            opcion=0;
        }
        }while (opcion != 8);

    }
}