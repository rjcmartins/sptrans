
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
* Classe que representa a tabela ORGAO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ORGAO\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("Legado.entity.Orgao")
public class Orgao implements Serializable {
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
    @Column(name = "codigo", nullable = true, unique = false, precision=17, scale=17, insertable=true, updatable=true)
        
        private java.lang.Double codigo;


    /**
    * @generated
    */
    @Column(name = "codigoorgaosuperior", nullable = true, unique = false, precision=17, scale=17, insertable=true, updatable=true)
        
        private java.lang.Double codigoorgaosuperior;


    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * Construtor
    * @generated
    */
    public Orgao(){
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
    public Orgao setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém codigo
    * return codigo
    * @generated
    */
    public java.lang.Double getCodigo() {
        return this.codigo;
    }

    /**
    * Define codigo
    * @param codigo codigo
    * @generated
    */
    public Orgao setCodigo(java.lang.Double codigo) {
        this.codigo = codigo;
        return this;
    }
    /**
    * Obtém codigoorgaosuperior
    * return codigoorgaosuperior
    * @generated
    */
    public java.lang.Double getCodigoorgaosuperior() {
        return this.codigoorgaosuperior;
    }

    /**
    * Define codigoorgaosuperior
    * @param codigoorgaosuperior codigoorgaosuperior
    * @generated
    */
    public Orgao setCodigoorgaosuperior(java.lang.Double codigoorgaosuperior) {
        this.codigoorgaosuperior = codigoorgaosuperior;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Orgao setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Orgao object = (Orgao)obj;
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