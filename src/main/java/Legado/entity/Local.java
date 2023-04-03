
package Legado.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela LOCAL
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"LOCAL\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("Legado.entity.Local")
public class Local implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, length=255, insertable=true, updatable=true)
        private java.lang.String id;


    /**
    * @generated
    */
    @Column(name = "coordenadas", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String coordenadas;


    /**
    * @generated
    */
    @Column(name = "latitude", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String latitude;


    /**
    * @generated
    */
    @Column(name = "local", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String local;


    /**
    * @generated
    */
    @Column(name = "longitude", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String longitude;


    /**
    * @generated
    */
    @Column(name = "regiao", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String regiao;


    /**
    * Construtor
    * @generated
    */
    public Local(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Local setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém coordenadas
    * return coordenadas
    * @generated
    */
    public java.lang.String getCoordenadas() {
        return this.coordenadas;
    }

    /**
    * Define coordenadas
    * @param coordenadas coordenadas
    * @generated
    */
    public Local setCoordenadas(java.lang.String coordenadas) {
        this.coordenadas = coordenadas;
        return this;
    }
    /**
    * Obtém latitude
    * return latitude
    * @generated
    */
    public java.lang.String getLatitude() {
        return this.latitude;
    }

    /**
    * Define latitude
    * @param latitude latitude
    * @generated
    */
    public Local setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
        return this;
    }
    /**
    * Obtém local
    * return local
    * @generated
    */
    public java.lang.String getLocal() {
        return this.local;
    }

    /**
    * Define local
    * @param local local
    * @generated
    */
    public Local setLocal(java.lang.String local) {
        this.local = local;
        return this;
    }
    /**
    * Obtém longitude
    * return longitude
    * @generated
    */
    public java.lang.String getLongitude() {
        return this.longitude;
    }

    /**
    * Define longitude
    * @param longitude longitude
    * @generated
    */
    public Local setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
        return this;
    }
    /**
    * Obtém regiao
    * return regiao
    * @generated
    */
    public java.lang.String getRegiao() {
        return this.regiao;
    }

    /**
    * Define regiao
    * @param regiao regiao
    * @generated
    */
    public Local setRegiao(java.lang.String regiao) {
        this.regiao = regiao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Local object = (Local)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}