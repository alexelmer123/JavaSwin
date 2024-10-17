
package com.alex.pe.cdatosdao;

import com.alex.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class TipoDocumentoDao {
    private String mensaje;
    
    //Primer metodo - INSERTAR TIPO DOCUMENTOS A LA DB
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "INSERT INTO TIPO_DOCUMENTO(NOMBRE, SIGLA, ESTADO ,ORDEN ,FECHA_ACTUALIZACION)"
                + "VALUES(?,?,?,?,?)";
        try {
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setString(5, tipoDocumento.getFechaActualizacion());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue creado corectamente";
            
            
        } catch (Exception e) {
            mensaje = "Alto! error al crear tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    
    //Segundo Metodo Eliminar
    public String elimiarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "DELETE FROM TIPO_DOCUMENTO WHERE ID_TIPO_DOCUMENTO = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, tipoDocumento.getIdTipoDocumento());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue eliminado corectamente";
        } catch (Exception e) {
            mensaje = "Alto! error al eliminar tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    
    //Tercero Metodo - Modificar Tipo documento.
    public String modificarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "UPDATE TIPO_DOCUMENTO "
                + " SET NOMBRE=?, SIGLA=?, ESTADO=?, ORDEN=?, FECHA_ACTUALIZACION=?"
                + " WHERE ID_TIPO_DOCUMENTO=?";
        try {
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setString(5, tipoDocumento.getFechaActualizacion());
            ps.setInt(6, tipoDocumento.getIdTipoDocumento());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue actualizado corectamente";
        } catch (Exception e) {
            mensaje = "Alto! error al actualizar tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    
    ///cuarto metodo
    public void ListarTipoDocumento(Connection conn,JTable table){
        DefaultTableModel model;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String[] columnas = {"ID","NOMBRE","SIGLA","ESTADO","ORDEN","FECHA_ACTUALIZACION"};
        model = new  DefaultTableModel (null, columnas);
        
        String sql = "select * from TIPO_DOCUMENTO ";
        String [] datosTP = new String [6];
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                TipoDocumento td = new TipoDocumento();
                td.setIdTipoDocumento(resultSet.getInt("ID_TIPO_DOCUMENTO"));
                td.setNombre(resultSet.getString("NOMBRE"));
                td.setEstado(resultSet.getString("Estado"));
                td.setOrden(resultSet.getInt("ORDEN"));
                td.setSigla(resultSet.getString("SIGLA"));
                td.setFechaActualizacion(resultSet.getString("FECHA_ACTUALIZACION"));
                
                datosTP[0] = td.getIdTipoDocumento()+"";
                datosTP[1] = td.getNombre()+"";
                datosTP[2] = td.getSigla()+"";
                datosTP[3] = td.getEstado()+"";
                datosTP[4] = td.getOrden()+"";
                datosTP[5] = td.getFechaActualizacion()+"";
                model.addRow(datosTP);
            
            }
            table.setModel(model);
                   
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }                              
    }
    
    public ArrayList<TipoDocumento> listarTipoDocumentosCombo(Connection conn){
        ArrayList<TipoDocumento> listaTipoDocumento = new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;
        
        String sql = "SELECT ID_TIPO_DOCUMENTO, NOMBRE FROM TIPO_DOCUMENTO " +
                     " ORDER BY ORDEN";
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                TipoDocumento td = new TipoDocumento();
                td.setIdTipoDocumento(resultSet.getInt("ID_TIPO_DOCUMENTO"));
                td.setNombre(resultSet.getString("NOMBRE"));
                listaTipoDocumento.add(td);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            System.out.println(e.getMessage());
        }
        return listaTipoDocumento;
    }
    }
