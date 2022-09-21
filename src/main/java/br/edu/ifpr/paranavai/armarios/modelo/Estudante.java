package br.edu.ifpr.paranavai.armarios.modelo;

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
}
