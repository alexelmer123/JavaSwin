/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alex.pe.cnegocio;

import java.sql.Connection;
import com.alex.pe.cdatosdao.TipoDocumentoDao;
import com.alex.pe.cmodelo.TipoDocumento;
import com.alex.pe.cdb.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;

public class TipoDocumentoBO {
    private String mensaje;
    TipoDocumentoDao tdd = new TipoDocumentoDao();
    
    public String agregarTipoDocomento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.agregarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    
    public String eliminarTipoDocomento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.elimiarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    
    public String modificarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.modificarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    
    public void ListarTipoDOcumento(JTable table) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            tdd.ListarTipoDocumento(c, table);
            c.commit();
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());    
        } finally {
            c.close();
        }
    
        
    }
       public ArrayList<TipoDocumento> listarTipoDocumentoCombo(){
        ArrayList<TipoDocumento> listaTipoDocumento = new ArrayList<>();
        Connection c = Conexion.getConnection();
        listaTipoDocumento = tdd.listarTipoDocumentosCombo(c);
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        return listaTipoDocumento;
    }
    
    }