package br.edu.ifpr.paranavai.armarios.modelo;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "tb_reserva")
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "estudante_id")
    private Estudante estudante;
    
    @ManyToOne
    @JoinColumn(name = "armario_id")
    private Armario armario;
    
    @Column(name = "dataHoraDevolucao")
    private Date dataHoraDevolucao;

    @Column(name = "dataHoraEmprestimo")
    private Date dataHoraEmprestimo;

    public Reserva() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Armario getArmario() {
        return armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }

    public Date getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Date dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public Date getDataHoraEmprestimo() {
        return dataHoraEmprestimo;
    }

    public void setDataHoraEmprestimo(Date dataHoraEmprestimo) {
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }
    

    public Reserva(Estudante estudante, Armario armario, Date dataHoraDevolucao, Date dataHoraEmprestimo) {
        this.estudante = estudante;
        this.armario = armario;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }
}
