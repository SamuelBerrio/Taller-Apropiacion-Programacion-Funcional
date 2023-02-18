package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int des;
        des = Integer.parseInt(JOptionPane.showInputDialog("1 -Crear una lista genérica y proveer la misma de valores, diseñe las funciones \n" +
                "para llenar con números enteros y con cadenas de texto (10 elementos\n" +
                "indicados por usted).\n" +
                "2 - Cree una función que permita transformar la lista de manera genérica, en el\n" +
                "caso de enteros, que sea posible transformar los números por su cuadrado.\n" +
                "3 - Cree una función que permita realizar una acción sobre la lista, sin retornar,\n" +
                "por ejemplo imprimir los valores de la lista.\n" +
                "4 - Cree una función que permita filtrar la lista de forma genérica, por ejemplo\n" +
                "cree una función que permita filtrar los números mayores de 10.\n" +
                "5 - Cree una función que permita reducir la lista, retornando la suma total de los\n" +
                "valores de la lista.\n" +
                "6 - Cree una clase utilitaria para crear las funciones de ejemplo a utilizar y utilice\n" +
                "métodos de referencia para hacer los llamados en una clase main que\n" +
                "permita mostrar el funcionamiento de lo diseñado."));

        switch (des){
            case 1:
                Utils.generarDatos(() ->new Random().nextInt(10)).forEach(System.out::println);
                Utils.generarDatos(Utils::pedirDatos).forEach(System.out::println);
                break;
            case 2:
                Utils.transformarAlCuadradoLista(List.of(1,2,3,4,5,6,7,8,9,10),valor -> valor * valor).forEach(System.out::println);
                break;
            case 3:
                Utils.imprimirLista(List.of(1,2,3,4,5,6,7,8,9,10), System.out::println);
                break;
            case 4:
                Utils.filtrarMayoresA10(List.of(1,2,3,13,5,6,7,8,11,10),valor -> valor > 10);
                break;
            case 5:
                Utils.sumarLista(List.of(1,2,3,13,5,6,7,8,11,10), Integer::sum);
                break;
            case 6:
                System.out.println("Seleccione otras opciones para probar");
                break;
        }
    }
}