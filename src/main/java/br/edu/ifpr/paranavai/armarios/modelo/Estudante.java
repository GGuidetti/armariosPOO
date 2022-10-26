package br.edu.ifpr.paranavai.armarios.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "tb_estudante")
@PrimaryKeyJoinColumn(name="idPessoa")
public class Estudante extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    
    @Column(name = "ra", nullable = false, length = 100)
    private String ra;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Estudante() {
    }
    
    public Estudante(Integer id, String ra, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.id = id;
        this.ra = ra;
    }
    
    
}
