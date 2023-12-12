/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.entity;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author guido
 */

@Entity
@Table(name = "proyecto")
public class proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String denominacion;
    private Date fechaInicio;
    private Date fechaFin;
    private String detalleArrastre;
    private String objetivoProyecto;
    private String tipo;
    private String recurrente;
    private BigDecimal costoProyecto;
    private Date fechaCreacion;
    private String estado;
    @JoinColumn(name = "responsable", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private persona responsable;
    @JoinColumn(name = "area", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private area area;
    @JoinColumn(name = "proceso", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private proceso proceso;

    public proyecto() {
    }


    // Getters and Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public String getDetalleArrastre() {
        return detalleArrastre;
    }
    public void setDetalleArrastre(String detalleArrastre) {
        this.detalleArrastre = detalleArrastre;
    }
    public String getObjetivoProyecto() {
        return objetivoProyecto;
    }
    public void setObjetivoProyecto(String objetivoProyecto) {
        this.objetivoProyecto = objetivoProyecto;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public BigDecimal getCostoProyecto() {
        return costoProyecto;
    }
    public void setCostoProyecto(Integer costoProyecto) {
        this.costoProyecto = new BigDecimal(costoProyecto);
    }
    public String getRecurrente() {
        return recurrente;
    }
    public void setRecurrente(String recurrente) {
        this.recurrente = recurrente;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public persona getResponsable() {
        return responsable;
    }
    public void setResponsable(persona responsable) {
        this.responsable = responsable;
    }
    public area getArea() {
        return area;
    }
    public void setArea(area area) {
        this.area = area;
    }
    public proceso getProceso() {
        return proceso;
    }
    public void setProceso(proceso proceso) {
        this.proceso = proceso;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}