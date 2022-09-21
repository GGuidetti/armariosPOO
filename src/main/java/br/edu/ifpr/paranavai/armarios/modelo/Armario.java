package br.edu.ifpr.paranavai.armarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_armario")
public class Armario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    
    
    @Column(name = "numero", unique = true, nullable = false)
    private String numero;
    
    @Column(name = "ativo", unique = true, nullable = false, length = 100)
    private boolean ativo;
    
    @Column(name = "observacoes", unique = true, nullable = false, length = 100)
    private String observacoes;

    public Armario() {
    }

    public Armario(String numero, boolean ativo, String observacoes) {
        this.numero = numero;
        this.ativo = ativo;
        this.observacoes = observacoes;
    }

    public Integer getArmarioId() {
        return id;
    }

    public void setArmarioId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
}