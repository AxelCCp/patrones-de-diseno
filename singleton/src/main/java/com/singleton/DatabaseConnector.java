package com.singleton;

/**
 *  Rules:
 *  1) Debemos tener un constructor vacio / We need to have an empty constructor
 *  2) Debemos tener un atributo privado estatico / We need to have a static private attribute
 *  3) Debemos tener un metodo estatico de devuelva la instancia / We need to have a public static method wich returns the instance
 */

public class DatabaseConnector {


    private DatabaseConnector(){
        System.out.println("Creando obj");
    }

    private static  DatabaseConnector databaseConnector;

    public static synchronized DatabaseConnector getInstance(){                                                         //synchronized : java se encarga de sincronizar los hilos, para q la conexion a la base de datos sea una a la vez.

        if(databaseConnector == null){
            databaseConnector = new DatabaseConnector();
        }

        return databaseConnector;
    }


    public void connectDatabase(){
        System.out.println("conectando bbdd: " + databaseConnector);
    }

    public void disconnectDatabase(){
        System.out.println("desconectando bbdd: " + databaseConnector);
    }


}
