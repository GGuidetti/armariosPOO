package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;

public interface BibliotecarioDao {
    public List<Bibliotecario> buscarTodos();
    public Bibliotecario buscarPorId(Integer id);
    public void inserir(Bibliotecario bibliotecario);
    public void atualizar(Bibliotecario bibliotecario);
    public void excluir(Bibliotecario bibliotecario);
}
