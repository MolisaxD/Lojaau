/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loja;

import DatabaseConnection.DBConnection;
import Telas.TelaCadastroFuncionario;
import Telas.TelaLogin;
import Telas.TelaPerfil;

/**
 *
 * @author suporte01
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnection db = new DBConnection();
        TelaLogin t= new TelaLogin();
        t.setVisible(true);
    }
    
}
