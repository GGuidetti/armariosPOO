package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.dao.PessoaDaoImpl;
import br.edu.ifpr.paranavai.armarios.modelo.Pessoa;
import java.util.List;
import br.edu.ifpr.paranavai.armarios.dao.PessoaDao;

public class PessoaServico {

    private static PessoaDao dao = new PessoaDaoImpl();

    public static List<Pessoa> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Pessoa buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static Pessoa inserir(Pessoa pessoa) {
         return dao.inserir(pessoa);
    }

    public static Pessoa atualizar(Pessoa pessoa) {
        return dao.atualizar(pessoa);
    }

    public static void excluir(Pessoa pessoa) {
        dao.excluir(pessoa);
    }
}
