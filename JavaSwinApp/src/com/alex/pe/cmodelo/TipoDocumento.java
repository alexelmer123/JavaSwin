
package com.alex.pe.cmodelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TipoDocumento {
    private int idTipoDocumento;
    private String nombre;
    private String sigla;
    private String estado;
    private int orden;
    private Date fechaActulizacion; 

//    public TipoDocumento(int idTipoDocumento, String nombre, String sigla, String estado, int orden, Date fecha) {
//        this.idTipoDocumento = idTipoDocumento;
//        this.nombre = nombre;
//        this.sigla = sigla;
//        this.estado = estado;
//        this.orden = orden;
//        this.fecha = fecha;
//    }
    public String getFechaActualizacion() {
    SimpleDateFormat dateFormat = new SimpleDateFormat ("dd-MM-yy");
    return dateFormat.format(fechaActulizacion);
     
  }



  public void setFechaActualizacion(String fechaActulizacion)throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
    this.fechaActulizacion = dateFormat.parse(fechaActulizacion);

  }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    
    
}