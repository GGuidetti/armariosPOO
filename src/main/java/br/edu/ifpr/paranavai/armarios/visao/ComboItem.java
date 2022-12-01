/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;

/**
 *
 * @author luis4
 */
class ComboItem
{
    private String key;
    private Localizacao localizacao;
    private Armario armario;
    private Estudante estudante;

    public ComboItem(String key, Localizacao localizacao)
    {
        this.key = key;
        this.localizacao = localizacao;
    }
    
    public ComboItem(String key, Armario armario)
    {
        this.key = key;
        this.armario = armario;
    }
    
    public ComboItem(String key, Estudante estudante)
    {
        this.key = key;
        this.estudante = estudante;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public Localizacao getLocalizacao()
    {
        return localizacao;
    }
    
    public Armario getArmario()
    {
        return armario;
    }
    
    public Estudante getEstudante()
    {
        return estudante;
    }
}