/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alex.pe.ctest;

import com.alex.pe.cmodelo.TipoDocumento;
import com.alex.pe.cnegocio.TipoDocumentoBo;
import java.sql.SQLException;

/**
 *
 * @author Soporte
 */
public class Test {
    TipoDocumentoBo tdbo = new TipoDocumentoBo();
    TipoDocumento td = new TipoDocumento();
    
    public void insertar() throws SQLException{
        td.setNombre("Registro Nacional de Identidad");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("DNI");
        tdbo.agregarTipoDocumentoDao(td);
    }
    public static void main (String[] arge) throws SQLException{
        Test t = new Test ();
        t.insertar();
    }
}
