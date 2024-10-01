
package com.alex.pe.cdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    private static Connection con = null;
    private static String usuario = "TIENDA_VIRTUAL1";
    private static String contraseña = "1234560";
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";

   public static Connection getConnection(){

    try {
//cargar el controlador jdvc

      Class.forName("oracle.jdbc.OracleDriver");

      //establecer la conexion con la base de datos 

      con = DriverManager.getConnection(url, usuario, contraseña);
      con.setAutoCommit(false);
      
      System.out.println("alex");
      
      if(con != null){

        System.out.println("se a conectado");
      }else {
          System.out.println("error conexion fallida");
      }
    } catch (Exception e) {
        System.out.println("Error, no se pudo desconectar"+e.getMessage());
}
    return con;
};
   public void closeConexion(){

    try {

      con.close();

      System.err.println("se a desconectado");



    } catch (Exception e) {

      System.out.println("Error, no se pudo desconectar"+e.getMessage());
    }

  }
  public static void main (String[]args){
      Conexion.getConnection();

  }

}

    
