/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LENOVO
 */
public class EventoModel {
    
    private String cliente;
    private String data;
    private String descricao;
    private String inicio;
    private String fim;

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public String getCliente() {
        return cliente;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFim() {
        return fim;
    }
}
