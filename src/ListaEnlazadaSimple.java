public class ListaEnlazadaSimple {
    //Atributos de tipo Nodo llamado cabeza
    private Nodo cabeza=null;

    //Constructores
    public ListaEnlazadaSimple() {
    }

    public ListaEnlazadaSimple(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    //Elimina toda la lista
    public void eliminar(){
        cabeza=null;
    }
    //ingresa un dato al inicio de la lista
    public void insertarAlInicio(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(cabeza);
        cabeza=nuevo;
    }
    //Metodo Eliminar al inicio de la lista
    public void  eliminarAlInicio(){
        if (cabeza!=null){
            System.out.println("Dato eliminado: "+cabeza.getDato());
            cabeza=cabeza.getSiguiente();

        }else {
            System.out.println("La lista esta vacia");
        }
    }
    //Metodo busqueda busca un nodo que concida con el dato en la lista
    public void busqueda(int dato){
        Nodo aux=cabeza;
        while(aux!=null){
            if(aux.getDato()==dato){
                System.out.println("El dato "+dato+" se encuentra en la lista");
                return;
            }
            aux=aux.getSiguiente();
        }
        System.out.println("El dato "+dato+" no se encuentra en la lista");
    }
    //Metodo insertarPocicion inserta un nodo en la pocicion que se le indique
    public void insertarPocicion(int dato, int pocicion){
        Nodo nuevo = new Nodo(dato);
        if(pocicion==0){
            nuevo.setSiguiente(cabeza);
            cabeza=nuevo;
        }
        else{
            Nodo aux=cabeza;
            int contador=0;
            while(contador<pocicion-1){
                aux=aux.getSiguiente();
                contador++;
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    //Metodo eliminarPocicion elimina un nodo en la pocicion que se le indique
    public void eliminarPocicion(int pocicion){
        // si la pocicion es 1 se elimina el primer nodo o cabeza
        if(pocicion == 1){
            cabeza=cabeza.getSiguiente();
        }
        // si la pocicion es diferente a 1 se recorre la lista hasta llegar a la pocicion
        else{
            // se crea un nodo auxiliar y un contador
            Nodo aux=cabeza;
            int contador=1;
            // se recorre la lista hasta llegar a una posicion antes de la pocicion
            while(contador<pocicion-1){
                // se recorre la lista
                aux=aux.getSiguiente();
                // se aumenta el contador
                contador++;
            }
            /* si la pocicion es la ultima se elimina el ultimo nodo
               para saver si es el ultimo nodo se verifica si el siguiente nodo del siguiente nodo es igual a null
                si es null significa es el ultimo nodo debido a que en el valor de .get   Siguiente() es null
             */
            if (aux.getSiguiente().getSiguiente()==null){
                System.out.println("Dato eliminado " + aux.getSiguiente().getDato());
                // se elimina el nodo, se le asigna null al siguiente nodo
                aux.setSiguiente(null);
            }
            // si la pocicion es diferente a la ultima se elimina el nodo en la pocicion
            else{
                System.out.println("Dato eliminado " + aux.getSiguiente().getDato());
                aux.setSiguiente(aux.getSiguiente().getSiguiente());

            }
        }
    }
    //Metodo imprimir, imprime los datos de la lista
    public void imprimir(){
        Nodo aux=cabeza;
        while(aux!=null){
            System.out.print(aux.getDato()+" ");
            aux=aux.getSiguiente();
        }
        System.out.println();
    }


    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
}
