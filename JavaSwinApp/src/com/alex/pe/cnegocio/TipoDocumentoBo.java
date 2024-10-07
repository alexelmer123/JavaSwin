/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alex.pe.cnegocio;

import com.alex.pe.cdatosdao.TipoDocumentoDao;
import com.alex.pe.cdb.Conexion;
import com.alex.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Soporte
 */
public class TipoDocumentoBo {
    private String mensaje;
    TipoDocumentoDao tdd =new TipoDocumentoDao();
    
    
    public String agregarTipoDocumentoDao(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.agregarTipoDocumentoDao(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        }finally{
            c.close();
            
        }
        return mensaje;
    }
       
    
}
