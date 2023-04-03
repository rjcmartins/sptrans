
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
* Classe que representa a tabela VIAGEM
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"VIAGEM\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("Legado.entity.Viagem")
public class Viagem implements Serializable {
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
    @ManyToOne
    @JoinColumn(name="fk_colaboradores", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "VIAGEM_fk_colaboradores_fkey", foreignKeyDefinition = "FOREIGN KEY (fk_colaboradores) REFERENCES COLABORADOR (id)"))
        
        private Colaborador colaborador;


    /**
    * @generated
    */
    @Column(name = "datafim", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String datafim;


    /**
    * @generated
    */
    @Column(name = "dataini", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String dataini;


    /**
    * @generated
    */
    @Column(name = "destino", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String destino;


    /**
    * @generated
    */
    @Column(name = "destinocidade", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String destinocidade;


    /**
    * @generated
    */
    @Column(name = "destinouf", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String destinouf;


    /**
    * @generated
    */
    @Column(name = "fk_situacao", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String fkSituacao;


    /**
    * @generated
    */
    @Column(name = "identificador", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String identificador;


    /**
    * @generated
    */
    @Column(name = "justificativaurgente", nullable = true, unique = false, length=2147483647, insertable=true, updatable=true)
        
        private java.lang.String justificativaurgente;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_local", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "VIAGEM_fk_local_fkey", foreignKeyDefinition = "FOREIGN KEY (fk_local) REFERENCES LOCAL (id)"))
        
        private Local local;


    /**
    * @generated
    */
    @Column(name = "motivo", nullable = true, unique = false, length=2147483647, insertable=true, updatable=true)
        
        private java.lang.String motivo;


    /**
    * @generated
    */
    @Column(name = "numeroproposta", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String numeroproposta;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_orgao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "VIAGEM_fk_orgao_fkey", foreignKeyDefinition = "FOREIGN KEY (fk_orgao) REFERENCES ORGAO (id)"))
        
        private Orgao orgao;


    /**
    * @generated
    */
    @Column(name = "outroscustos", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String outroscustos;


    /**
    * @generated
    */
    @Column(name = "urgente", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean urgente;


    /**
    * @generated
    */
    @Column(name = "valordiaria", nullable = true, unique = false, length=2147483647, insertable=true, updatable=true)
        
        private java.lang.String valordiaria;


    /**
    * @generated
    */
    @Column(name = "valorpassagem", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String valorpassagem;


    /**
    * Construtor
    * @generated
    */
    public Viagem(){
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
    public Viagem setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém colaborador
    * return colaborador
    * @generated
    */
    public Colaborador getColaborador() {
        return this.colaborador;
    }

    /**
    * Define colaborador
    * @param colaborador colaborador
    * @generated
    */
    public Viagem setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
        return this;
    }
    /**
    * Obtém datafim
    * return datafim
    * @generated
    */
    public java.lang.String getDatafim() {
        return this.datafim;
    }

    /**
    * Define datafim
    * @param datafim datafim
    * @generated
    */
    public Viagem setDatafim(java.lang.String datafim) {
        this.datafim = datafim;
        return this;
    }
    /**
    * Obtém dataini
    * return dataini
    * @generated
    */
    public java.lang.String getDataini() {
        return this.dataini;
    }

    /**
    * Define dataini
    * @param dataini dataini
    * @generated
    */
    public Viagem setDataini(java.lang.String dataini) {
        this.dataini = dataini;
        return this;
    }
    /**
    * Obtém destino
    * return destino
    * @generated
    */
    public java.lang.String getDestino() {
        return this.destino;
    }

    /**
    * Define destino
    * @param destino destino
    * @generated
    */
    public Viagem setDestino(java.lang.String destino) {
        this.destino = destino;
        return this;
    }
    /**
    * Obtém destinocidade
    * return destinocidade
    * @generated
    */
    public java.lang.String getDestinocidade() {
        return this.destinocidade;
    }

    /**
    * Define destinocidade
    * @param destinocidade destinocidade
    * @generated
    */
    public Viagem setDestinocidade(java.lang.String destinocidade) {
        this.destinocidade = destinocidade;
        return this;
    }
    /**
    * Obtém destinouf
    * return destinouf
    * @generated
    */
    public java.lang.String getDestinouf() {
        return this.destinouf;
    }

    /**
    * Define destinouf
    * @param destinouf destinouf
    * @generated
    */
    public Viagem setDestinouf(java.lang.String destinouf) {
        this.destinouf = destinouf;
        return this;
    }
    /**
    * Obtém fkSituacao
    * return fkSituacao
    * @generated
    */
    public java.lang.String getFkSituacao() {
        return this.fkSituacao;
    }

    /**
    * Define fkSituacao
    * @param fkSituacao fkSituacao
    * @generated
    */
    public Viagem setFkSituacao(java.lang.String fkSituacao) {
        this.fkSituacao = fkSituacao;
        return this;
    }
    /**
    * Obtém identificador
    * return identificador
    * @generated
    */
    public java.lang.String getIdentificador() {
        return this.identificador;
    }

    /**
    * Define identificador
    * @param identificador identificador
    * @generated
    */
    public Viagem setIdentificador(java.lang.String identificador) {
        this.identificador = identificador;
        return this;
    }
    /**
    * Obtém justificativaurgente
    * return justificativaurgente
    * @generated
    */
    public java.lang.String getJustificativaurgente() {
        return this.justificativaurgente;
    }

    /**
    * Define justificativaurgente
    * @param justificativaurgente justificativaurgente
    * @generated
    */
    public Viagem setJustificativaurgente(java.lang.String justificativaurgente) {
        this.justificativaurgente = justificativaurgente;
        return this;
    }
    /**
    * Obtém local
    * return local
    * @generated
    */
    public Local getLocal() {
        return this.local;
    }

    /**
    * Define local
    * @param local local
    * @generated
    */
    public Viagem setLocal(Local local) {
        this.local = local;
        return this;
    }
    /**
    * Obtém motivo
    * return motivo
    * @generated
    */
    public java.lang.String getMotivo() {
        return this.motivo;
    }

    /**
    * Define motivo
    * @param motivo motivo
    * @generated
    */
    public Viagem setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
        return this;
    }
    /**
    * Obtém numeroproposta
    * return numeroproposta
    * @generated
    */
    public java.lang.String getNumeroproposta() {
        return this.numeroproposta;
    }

    /**
    * Define numeroproposta
    * @param numeroproposta numeroproposta
    * @generated
    */
    public Viagem setNumeroproposta(java.lang.String numeroproposta) {
        this.numeroproposta = numeroproposta;
        return this;
    }
    /**
    * Obtém orgao
    * return orgao
    * @generated
    */
    public Orgao getOrgao() {
        return this.orgao;
    }

    /**
    * Define orgao
    * @param orgao orgao
    * @generated
    */
    public Viagem setOrgao(Orgao orgao) {
        this.orgao = orgao;
        return this;
    }
    /**
    * Obtém outroscustos
    * return outroscustos
    * @generated
    */
    public java.lang.String getOutroscustos() {
        return this.outroscustos;
    }

    /**
    * Define outroscustos
    * @param outroscustos outroscustos
    * @generated
    */
    public Viagem setOutroscustos(java.lang.String outroscustos) {
        this.outroscustos = outroscustos;
        return this;
    }
    /**
    * Obtém urgente
    * return urgente
    * @generated
    */
    public java.lang.Boolean getUrgente() {
        return this.urgente;
    }

    /**
    * Define urgente
    * @param urgente urgente
    * @generated
    */
    public Viagem setUrgente(java.lang.Boolean urgente) {
        this.urgente = urgente;
        return this;
    }
    /**
    * Obtém valordiaria
    * return valordiaria
    * @generated
    */
    public java.lang.String getValordiaria() {
        return this.valordiaria;
    }

    /**
    * Define valordiaria
    * @param valordiaria valordiaria
    * @generated
    */
    public Viagem setValordiaria(java.lang.String valordiaria) {
        this.valordiaria = valordiaria;
        return this;
    }
    /**
    * Obtém valorpassagem
    * return valorpassagem
    * @generated
    */
    public java.lang.String getValorpassagem() {
        return this.valorpassagem;
    }

    /**
    * Define valorpassagem
    * @param valorpassagem valorpassagem
    * @generated
    */
    public Viagem setValorpassagem(java.lang.String valorpassagem) {
        this.valorpassagem = valorpassagem;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Viagem object = (Viagem)obj;
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