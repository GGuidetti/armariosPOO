package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.dao.ReservaDaoImpl;
import br.edu.ifpr.paranavai.armarios.modelo.Reserva;
import java.util.List;
import br.edu.ifpr.paranavai.armarios.dao.ReservaDao;

public class ReservaServico {

    private static ReservaDao dao = new ReservaDaoImpl();

    public static List<Reserva> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Reserva buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static Reserva inserir(Reserva reserva) {
         return dao.inserir(reserva);
    }

    public static Reserva atualizar(Reserva reserva) {
        return dao.atualizar(reserva);
    }

    public static void excluir(Reserva reserva) {
        dao.excluir(reserva);
    }
}
