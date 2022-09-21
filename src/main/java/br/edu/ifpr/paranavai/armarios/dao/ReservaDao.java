package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Reserva;

public interface ReservaDao {
    public List<Reserva> buscarTodos();
    public Reserva buscarPorId(Integer id);
    public void inserir(Reserva reserva);
    public void atualizar(Reserva reserva);
    public void excluir(Reserva reserva);
}