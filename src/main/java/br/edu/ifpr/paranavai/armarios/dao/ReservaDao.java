package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Reserva;

public interface ReservaDao {
    public List<Reserva> buscarTodos();
    public Reserva buscarPorId(Integer id);
    public Reserva inserir(Reserva reserva);
    public Reserva atualizar(Reserva reserva);
    public void excluir(Reserva reserva);
}
