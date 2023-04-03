
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
* Classe que representa a tabela COLABORADOR
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"COLABORADOR\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("Legado.entity.Colaborador")
public class Colaborador implements Serializable {
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
    @Column(name = "cargo", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String cargo;


    /**
    * @generated
    */
    @Column(name = "codfuncao", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String codfuncao;


    /**
    * @generated
    */
    @Column(name = "descfuncao", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String descfuncao;


    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * Construtor
    * @generated
    */
    public Colaborador(){
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
    public Colaborador setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém cargo
    * return cargo
    * @generated
    */
    public java.lang.String getCargo() {
        return this.cargo;
    }

    /**
    * Define cargo
    * @param cargo cargo
    * @generated
    */
    public Colaborador setCargo(java.lang.String cargo) {
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém codfuncao
    * return codfuncao
    * @generated
    */
    public java.lang.String getCodfuncao() {
        return this.codfuncao;
    }

    /**
    * Define codfuncao
    * @param codfuncao codfuncao
    * @generated
    */
    public Colaborador setCodfuncao(java.lang.String codfuncao) {
        this.codfuncao = codfuncao;
        return this;
    }
    /**
    * Obtém descfuncao
    * return descfuncao
    * @generated
    */
    public java.lang.String getDescfuncao() {
        return this.descfuncao;
    }

    /**
    * Define descfuncao
    * @param descfuncao descfuncao
    * @generated
    */
    public Colaborador setDescfuncao(java.lang.String descfuncao) {
        this.descfuncao = descfuncao;
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
    public Colaborador setNome(java.lang.String nome) {
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
Colaborador object = (Colaborador)obj;
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