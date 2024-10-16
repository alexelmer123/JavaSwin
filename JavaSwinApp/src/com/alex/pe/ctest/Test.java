/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alex.pe.ctest;

import com.alex.pe.cmodelo.TipoDocumento;
import com.alex.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.text.ParseException;

public class Test {
    TipoDocumentoBO tdbo = new  TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public  void insertar() throws SQLException, ParseException{
        td.setIdTipoDocumento(2);
        td.setNombre("Nacional de Identidad");
        td.setEstado("2");
        td.setOrden(2);
        td.setSigla("dni");
        td.setFechaActualizacion("09-10-2024");
        tdbo.agregarTipoDocomento(td);
    }
    /*
    public  void eliminar() throws SQLException, ParseException{
        td.setIdTipoDocumento(9);
        tdbo.eliminarTipoDocomento(td);
    }
    
    public  void modificar() throws SQLException, ParseException{
        td.setIdTipoDocumento(1);
        td.setNombre("ALEX");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("D");
        td.setFechaActualizacion("09-10-2024");        
        tdbo.modificarTipoDocumento(td);
    }*/
   
    public static void main(String[] args) throws SQLException, ParseException {
        Test t = new  Test();
        t.insertar();
        //t.eliminar();
        //t.modificar();
    }
}