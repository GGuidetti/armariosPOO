package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Pessoa;

public interface PessoaDao {
    public List<Pessoa> buscarTodos();
    public Pessoa buscarPorId(Integer id);
    public Pessoa inserir(Pessoa pessoa);
    public Pessoa atualizar(Pessoa pessoa);
    public void excluir(Pessoa pessoa);
}
