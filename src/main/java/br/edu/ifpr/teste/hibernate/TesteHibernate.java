package br.edu.ifpr.teste.hibernate;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import org.hibernate.Session;

public class TesteHibernate {

    public static void main(String[] args) {
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        Estudante estudante = new Estudante(
            1,
            "20210002202",
            "Pedro Henrique Santos Kusiak",
            "pedrokusiak24@gmail.com",
            "44999999999",
            "cudizap69",
            true,
            null,
            null
        );
        sessao.save(estudante);

        sessao.getTransaction().commit();
    }
}