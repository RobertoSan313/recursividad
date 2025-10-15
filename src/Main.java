//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Clase Nodo
    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Método recursivo para contar nodos
    public static int contarNodos(Nodo n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + contarNodos(n.siguiente);
        }
    }

    // Método recursivo para buscar un número en la lista
    public static boolean buscar(Nodo n, int valor) {
        if (n == null) {
            return false;
        } else if (n.dato == valor) {
            return true;
        } else {
            return buscar(n.siguiente, valor);
        }
    }

    public static void main(String[] args) {

        Nodo n1 = new Nodo(10);
        Nodo n2 = new Nodo(20);
        Nodo n3 = new Nodo(30);
        Nodo n4 = new Nodo(40);

        // Enlazar
        n1.siguiente = n2;
        n2.siguiente = n3;
        n3.siguiente = n4;

        // Contar nodos
        int total = contarNodos(n1);
        System.out.println("Total de nodos en la lista: " + total);


        int numeroBuscado = 30;
        if (buscar(n1, numeroBuscado)) {
            System.out.println("El número " + numeroBuscado + " SÍ se encuentra en la lista.");
        } else {
            System.out.println("El número " + numeroBuscado + " NO se encuentra en la lista.");
        }
    }
}