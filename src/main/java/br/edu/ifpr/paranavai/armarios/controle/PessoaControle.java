package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Pessoa;
import br.edu.ifpr.paranavai.armarios.servico.PessoaServico;
import java.util.List;

public class PessoaControle {
    public static List<Pessoa> listarTodasPessoas(){
        return PessoaServico.buscarTodos();
    }

    public static Pessoa inserir(Pessoa pessoa) {
        return PessoaServico.inserir(pessoa);
    }

    public static Pessoa buscarPorId(int codigo) {
        return PessoaServico.buscarPorId(codigo);
    }
    public static Pessoa atualizar(Pessoa pessoa) {
        return PessoaServico.atualizar(pessoa);
    }
    
    public static void excluir (Pessoa pessoa) {
        PessoaServico.excluir(pessoa);
    }
}
