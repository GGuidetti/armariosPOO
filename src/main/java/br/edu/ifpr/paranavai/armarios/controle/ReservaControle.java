package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Reserva;
import br.edu.ifpr.paranavai.armarios.servico.ReservaServico;
import java.util.List;

public class ReservaControle {
    public static List<Reserva> listarTodasReservas(){
        return ReservaServico.buscarTodos();
    }
}
