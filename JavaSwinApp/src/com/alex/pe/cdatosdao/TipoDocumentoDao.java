
package com.alex.pe.cdatosdao;

import com.alex.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class TipoDocumentoDao {
    private String mensaje;
    ///inserter tipo documentos a la db;
    public String agregarTipoDocumentoDao(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "INSERT INTO TIPO_DOCUMENTO(NOMBRE,SIGLA,ESTADO,ORDEN)"
                +"VALUES (?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            //ps.setDate(5,() tipoDocumento.ge);
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue creado correctamento:      ";

        } catch (Exception e) {
            mensaje = "Alto error al crear tipo documento:  ";
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    ///SEGUNDO METODO - MODIFICAR TIPO DOCUMENTO
}
