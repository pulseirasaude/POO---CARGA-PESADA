/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Contato;

/**
 *
 * @author 20181bsi0172
 */
public class ContatoBD implements InterfaceBD{

    @Override
    public ArrayList select() throws SQLException {
        ArrayList listContato = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM CONTATO;");
        while (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO
            Contato contato = new Contato();
            contato.setIdContato(rs.getInt("id"));
            contato.setTelefone1(rs.getInt("TELEFONE_01"));
            contato.setTelefone2(rs.getInt("TELEFONE_02"));
            contato.setTelefone3(rs.getInt("TELEFONE_03"));
            contato.setEmail(rs.getString("EMAIL"));


            listContato.add(contato);
        }
        
        rs.close();
        stmt.close();
        c.close();
        
        return listContato;
    }

    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Contato novo = (Contato)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO CONTATO(TELEFONE_01, TELEFONE_02, TELEFONE_03, EMAIL) values('"
                + ""+ novo.getTelefone1() +"','" + novo.getTelefone2() + "','" + novo.getTelefone3()+ "','"
                + novo.getEmail() + "')");
        rs.close();
        stmt.close();
        c.close();

    }

    @Override
    public void delet(int id) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        String sql = "DELETE from CONTATO where ID=" + id + ";";
        
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }

    @Override
    public void update(Object obj) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        Contato novo = (Contato)obj;
        String sql = "UPDATE CONTATO "
                + "SET TELEFONE_01 ="+ novo.getTelefone1() + ", "
                + "TELEFONE_02="+ novo.getTelefone2()+ ", "
                + "TELEFONE_03="+ novo.getTelefone3()+ ", "
                + "EMAIL="+ novo.getEmail()+ " "
                + "WHERE id ="+ novo.getIdContato()+ ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }
    
}
