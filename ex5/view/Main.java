package ex5.view;

import ex5.model.*;

public class Main {
    public static void main(String[] args) {

        Conversor conversor = new Conversor();

        System.out.println("Celsius para Fahrenheit: " + conversor.converter(30.0));

        System.out.println("Quilômetros para milhas: " + conversor.converter(100));

        System.out.println("Texto em maiúsculas: " + conversor.converter("ola mundo"));
    }
}