package br.edu.ifpr.paranavai.armarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_localizacao")
public class Localizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    public Localizacao() {
    }

    public Localizacao(String nome) {
        this.nome = nome;
    }

    public Integer getLocalizacaoId() {
        return id;
    }

    public void setLocalizacaoId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Localizacao{" + "id=" + id + ", nome=" + nome + '}';
    }

}
