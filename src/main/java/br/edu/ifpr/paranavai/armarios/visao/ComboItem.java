/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;

/**
 *
 * @author luis4
 */
class ComboItem
{
    private String key;
    private Localizacao localizacao;

    public ComboItem(String key, Localizacao localizacao)
    {
        this.key = key;
        this.localizacao = localizacao;
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
}