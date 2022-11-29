package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import br.edu.ifpr.paranavai.armarios.servico.BibliotecarioServico;
import java.util.List;

public class BibliotecarioControle {
    public static List<Bibliotecario> listaTodosBibliotecarios(){
        return BibliotecarioServico.buscarTodos();
    }

    public static Bibliotecario inserir(Bibliotecario bibliotecario) {
        return BibliotecarioServico.inserir(bibliotecario);
    }

    public static Bibliotecario buscarPorId(int codigo) {
        return BibliotecarioServico.buscarPorId(codigo);
    }
    public static Bibliotecario atualizar(Bibliotecario bibliotecario) {
        return BibliotecarioServico.atualizar(bibliotecario);
    }
    
    public static void excluir (Bibliotecario bibliotecario) {
        BibliotecarioServico.excluir(bibliotecario);
    }
}
