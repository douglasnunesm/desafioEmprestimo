package com.dougl.desafioemprestimorealm.entity;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by dougl on 17/10/2017.
 */

public class Emprestimo extends SugarRecord<Emprestimo>{

    private String nome;
    private String objeto;
    private Date data;
    private Date dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(String nome, String objeto, Date data, Date dataDevolucao) {
        this.nome = nome;
        this.objeto = objeto;
        this.data = data;
        this.dataDevolucao = dataDevolucao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "nome='" + nome + '\'' +
                ", objeto='" + objeto + '\'' +
                ", data=" + data +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
