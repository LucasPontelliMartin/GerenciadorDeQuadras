/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AgendaDAO;
import Model.EventoModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author LENOVO
 */
public class AgendaController {
    
    public void Salvar (EventoModel evento) throws IOException
    {
        AgendaDAO dao = new AgendaDAO();
        
        String conteudo = "\n" + evento.getCliente() + " - " + evento.getData()+ " - " + evento.getDescricao()+ " - " + evento.getInicio()+ " - " + evento.getFim(); 
        dao.SalvarEvento(conteudo);
    }
    
    public List<EventoModel> Buscar ()
    {
       List<EventoModel> dados = new ArrayList<>();

        File arquivo = new File("./src/Agenda.txt" );
        if (arquivo.exists()) {
            String dadosEvento[] = new String[5];
            try {
                BufferedReader in = new BufferedReader(new FileReader(arquivo));

                while (in.ready()) {
                    
                dadosEvento = (in.readLine().split(Pattern.quote(" - ")));
                    
                EventoModel cliente = new EventoModel();
                cliente.setCliente("        " + dadosEvento[0]);
                cliente.setData("      " + dadosEvento[1]);
                cliente.setDescricao("        " + dadosEvento[2]);
                cliente.setInicio("        " + dadosEvento[3]);
                cliente.setFim("        " + dadosEvento[4]);
                dados.add(cliente);
                }
                in.close();
            } catch (IOException ex) {
            
        }
        }
        return dados;
    }
}
