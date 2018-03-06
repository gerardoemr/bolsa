package modelo;
// Generated 6/03/2018 02:07:24 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Vacante generated by hbm2java
 */
public class Vacante  implements java.io.Serializable {


     private int idV;
     private Empresa empresa;
     private String puesto;
     private BigDecimal salario;
     private String lugar;
     private String horario;
     private String descripcion;
     private String actividades;
     private Set postulars = new HashSet(0);

    public Vacante() {
    }

	
    public Vacante(int idV, Empresa empresa) {
        this.idV = idV;
        this.empresa = empresa;
    }
    public Vacante(int idV, Empresa empresa, String puesto, BigDecimal salario, String lugar, String horario, String descripcion, String actividades, Set postulars) {
       this.idV = idV;
       this.empresa = empresa;
       this.puesto = puesto;
       this.salario = salario;
       this.lugar = lugar;
       this.horario = horario;
       this.descripcion = descripcion;
       this.actividades = actividades;
       this.postulars = postulars;
    }
   
    public int getIdV() {
        return this.idV;
    }
    
    public void setIdV(int idV) {
        this.idV = idV;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public BigDecimal getSalario() {
        return this.salario;
    }
    
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getHorario() {
        return this.horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getActividades() {
        return this.actividades;
    }
    
    public void setActividades(String actividades) {
        this.actividades = actividades;
    }
    public Set getPostulars() {
        return this.postulars;
    }
    
    public void setPostulars(Set postulars) {
        this.postulars = postulars;
    }




}

