package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.dao.BibliotecarioDaoImpl;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import java.util.List;
import br.edu.ifpr.paranavai.armarios.dao.BibliotecarioDao;

public class BibliotecarioServico {

    private static BibliotecarioDao dao = new BibliotecarioDaoImpl();

    public static List<Bibliotecario> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Bibliotecario buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static Bibliotecario inserir(Bibliotecario bibliotecario) {
        return dao.inserir(bibliotecario);
    }

    public static Bibliotecario atualizar(Bibliotecario bibliotecario) {
        return dao.atualizar(bibliotecario);
    }

    public static void excluir(Bibliotecario bibliotecario) {
        dao.excluir(bibliotecario);
    }
}
