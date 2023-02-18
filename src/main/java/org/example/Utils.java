package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Utils {
    public static <T> List<T> generarDatos(Supplier<T> supplier){
        List<T> result = new ArrayList<>();
        for (int i= 0; i<11; i++){
            result.add(supplier.get());
        }
        return result;
    }
    public static String pedirDatos(){
        String des;
        return des = JOptionPane.showInputDialog("Ingrese una palabra");
    }

    public static <T,R> List<R> transformarAlCuadradoLista(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T valor: list){
           result.add(function.apply(valor));
        }
        return result;
    }

    public static <T> void imprimirLista(List<T> list, Consumer<T> function){
        for(T valor: list){
            function.accept(valor);
        }
    }

    public static <T extends Number> void filtrarMayoresA10(List<T> list, Predicate<T> function){
        List<T> list2 = new ArrayList<>();
        for (T valor:list){
            if (function.test(valor)){
                list2.add(valor);
            }
        }
        list = list2;
        list.forEach(System.out::println);
    }

    public static <T extends Number> void sumarLista(List<T> list, MyFunctionalInterface<T> function){
        List<T> list2 = new ArrayList<>();
        T suma = null;
        for (T valor:list){
            if (suma == null){
                suma = valor;
            }else{
                suma = function.addMethod(valor,suma);
            }
        }
        list2.add(suma);
        list = list2;
        list.forEach(System.out::println);
    }
}

@FunctionalInterface
interface MyFunctionalInterface <T extends Number>{
    T addMethod(T a, T b);
}
