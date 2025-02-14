import java.util.*;

public class Metodos {

    public static int sumaNTerminos(int n){
        int suma=0;
        for (int i=0; i<=n; i++){
            suma += i;
        }
        return suma;
    }

    public static int factorial(int n){
        int factorial=1;
        for (int i=1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int potencia(int n, int m){
        int potencia=1;
        for (int i=0; i<m; i++){
            potencia *= n;
        }
        return potencia;
    }

    public static int sumaLista(List <Integer> listaDada){
        int sumaLista=0;
        for (int i=0; i<listaDada.size(); i++){
            sumaLista+=listaDada.get(i);
        }
        return sumaLista;
    }

    public static double mediaLista(List <Integer> listaDada){

        return (double) Metodos.sumaLista(listaDada)/listaDada.size();
    }

    public static double desvTipicaLista(List <Integer> listaDada){
        double parentesis=0;
        for (Integer num: listaDada){
            parentesis += Math.pow((num - Metodos.mediaLista(listaDada)),2);
        }
        return Math.sqrt(parentesis/(listaDada.size()-1));
    }

    public static int sumaParesHastaN(int n){

        int sumaPares=0;

        if (n%2==1){
            n--;
        }
        while (n>=2){
            sumaPares+=n;
            n-=2;
        }
        return sumaPares;
    }

    public static int sumaParesLista(List<Integer> listaDada){
        int sumaPares=0;
        for (Integer num: listaDada){
            if (num%2==0){
                sumaPares+=num;
            }
        }
        return sumaPares;
    }

    public static List<Integer> listaParesDeLista(List<Integer> listaDada){
        List<Integer> listaPares = new ArrayList<>();
        for (Integer num: listaDada){
            if (num%2==0){
                listaPares.add(num);
            }
        }
        return listaPares;
    }

    public static List<Integer> listaParesHastaN(int n){
        List <Integer> listaPares = new ArrayList<>();
        if (n%2!=0){
            n-=1;
        }
        while (n>=2){
            listaPares.add(n);
            n-=2;
        }
        return listaPares;
    }

    public static int calcularProductoEscalar(List <Integer> vector1, List <Integer> vector2){

        if (vector1.size()!= vector2.size()){
            System.out.println("El producto escalar solo es posible entre vectores con la misma cantidad de elementos.");
        }
        int escalar = 0;

        for (int i = 0; i<vector1.size(); i++){
            escalar+=vector1.get(i)*vector2.get(i);
        }
        return escalar;
    }

}