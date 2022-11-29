package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import br.edu.ifpr.paranavai.armarios.servico.ArmarioServico;
import java.util.List;

public class ArmarioControle {
    public static List<Armario> listarTodosArmarios(){
        return ArmarioServico.buscarTodos();
    }

    public static Armario inserir(Armario armario) {
        return ArmarioServico.inserir(armario);
    }

    public static Armario buscarPorId(int codigo) {
        return ArmarioServico.buscarPorId(codigo);
    }
    public static Armario atualizar(Armario armario) {
        return ArmarioServico.atualizar(armario);
    }
    
    public static void excluir (Armario armario) {
        ArmarioServico.excluir(armario);
    }
}
