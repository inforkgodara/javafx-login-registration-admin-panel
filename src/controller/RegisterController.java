/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.DbConnection;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Ramesh Godara
 */
public class RegisterController implements Initializable {

    private final Connection con;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField email;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private TextField confirmPassword;
    
    @FXML
    private Button registerButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public RegisterController() {
        DbConnection dbc = DbConnection.getDatabaseConnection();
        con = dbc.getConnection();
    }
    
    @FXML
    private void register() {
        
    }
}
