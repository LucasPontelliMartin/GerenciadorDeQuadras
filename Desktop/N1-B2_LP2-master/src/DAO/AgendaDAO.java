/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class AgendaDAO {
    public void SalvarEvento (String conteudo) throws IOException{
         
        FileWriter file = new FileWriter("./src/Agenda.txt", true);
        file.write( conteudo);
        file.close();
    }
   
   public  List<String> LerDadosCliente () throws FileNotFoundException, IOException
    {
        List<String> dados = new ArrayList<>();

        File arquivo = new File("./src/Agenda.txt" );
        if (arquivo.exists()) {
            String dadosEventos = "";
            try {
                BufferedReader in = new BufferedReader(new FileReader(arquivo));

                while (in.ready()) {
                dadosEventos = in.readLine();  
               
                dados.add(dadosEventos);
                }
                in.close();
            } catch (IOException ex) {
            
        }
       
        }
         return dados;  
    }
}
