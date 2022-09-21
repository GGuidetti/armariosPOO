package br.edu.ifpr.teste.hibernate;

import br.edu.ifpr.paranavai.armarios.dao.LocalizacaoDao;
import br.edu.ifpr.paranavai.armarios.dao.LocalizacaoDaoImpl;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import java.util.List;
import org.hibernate.Session;

public class TesteHibernate {

    public static void main(String[] args) {
        LocalizacaoDao dao = new LocalizacaoDaoImpl();
        
        // Localizacao local = new Localizacao("Biblioteca");

        //dao.inserir(local);
        List<Localizacao> lista = dao.buscarTodos();
        
       // Localizacao localNovo = new Localizacao("Bloco 2");
        
        // dao.inserir(localNovo);
        
        for (Localizacao localizacao : lista) {
            System.out.println(localizacao.toString());
        }
         Localizacao local = dao.buscarPorId(1);
         System.out.println(local.toString());
         
         local.setNome("Bloco Administrativo");
         dao.atualizar(local);
         
         local = dao.buscarPorId(1);
         
         System.out.println(local.toString());
         
    }
}