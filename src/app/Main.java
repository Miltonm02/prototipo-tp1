package app;

import conexion.ConexionDB;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = ConexionDB.conectar();
        
        if (conn != null) {
            System.out.println("¡Conexión establecida correctamente desde el prototipo!");
        } else {
            System.out.println("No se pudo establecer conexión.");
        }
    }
}
