package co.edu.unaula.dataStructure;

import classList.ListClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListClass listaSimple = new ListClass();
        String mensaje ="";
        int opcion = 0;

        Scanner read = new Scanner(System.in);
        System.out.println("agregar");
        System.out.println("borrar");
        System.out.println("imprimir");



        while (opcion != 4){
            opcion = read.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("-------------------------------");
                    mensaje = read.next();
                    listaSimple.addNode(mensaje);
                    System.out.println("-------------------------------");

                    break;
                case 2:
                    System.out.println("-------------------------------");
                    listaSimple.deleteOneNode();
                    System.out.println("-------------------------------");

                    break;
                case 3:
                    System.out.println("-------------------------------");
                    listaSimple.print();
                    System.out.println("-------------------------------");

                    break;
            }
        }




    }
}
