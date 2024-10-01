public class ListaEnlazadaSimple {
    private Nodo cabeza=null;

    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato);
        if(cabeza==null){
            cabeza=nuevo;
        }else{
            Nodo aux=cabeza;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    public void  eliminarAlInicio(){
        if(cabeza!=null){
            cabeza=cabeza.getSiguiente();
        }
    }
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
    public void eliminarPocicion(int pocicion){
        if(pocicion == 0){
            cabeza=cabeza.getSiguiente();
        }
        else{
            Nodo aux=cabeza;
            int contador=0;
            while(contador<pocicion-1){
                aux=aux.getSiguiente();
                contador++;
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
    }
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
