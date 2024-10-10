
package com.alex.pe.cdatosdao;

import com.alex.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

public class TipoDocumentoDao {
    private String mensaje;
    
    //Primer metodo - INSERTAR TIPO DOCUMENTOS A LA DB
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "INSERT INTO TIPO_DOCUMENTO(NOMBRE,SIGLA,ESTADO,ORDEN,FECHA_ACTUALIZACION)"
                + "VALUES(?,?,?,,?,?)";
        try {
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setString(5, tipoDocumento.getFecha());
            ps.setString(6, tipoDocumento.getFechaActulizacion());
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
                + " SET NOMBRE=?, SIGLA=?, ESTADO=?, ORDEN=?, FECHA_REGISTRO=?, FECHA_ACTUALIZA=?"
                + " WHERE ID_TIPO_DOCUMENTO=?";
        try {
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setString(5, tipoDocumento.getFecha());
            ps.setString(6, tipoDocumento.getFechaActulizacion());
            ps.setInt(7, tipoDocumento.getIdTipoDocumento());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue actualizado corectamente";
        } catch (Exception e) {
            mensaje = "Alto! error al actualizar tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    
    //........
}