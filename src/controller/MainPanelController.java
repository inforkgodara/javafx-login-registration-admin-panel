/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ramesh Godara
 */
public class MainPanelController implements Initializable {

    @FXML
    private BorderPane borderPane;

    private List<Button> menus;

    @FXML
    private AreaChart<?, ?> chartPurchase;

    @FXML
    private AreaChart<?, ?> chartSale;

    @FXML
    private LineChart<?, ?> chartReceipt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private void changeButtonBackground(ActionEvent e) {
        Iterator<Button> iteratorMenus = menus.iterator();

        while (iteratorMenus.hasNext()) {
            Button clickedButton = (Button) e.getSource();
            Button OtherButton = iteratorMenus.next();
            if (clickedButton == OtherButton) {
                clickedButton.setStyle("-fx-text-fill:#f0f0f0;-fx-background-color:#2b2a26;");
            } else {
                if (OtherButton != null) {
                    OtherButton.setStyle("-fx-text-fill:#f0f0f0;-fx-background-color:#404040;");
                }
            }
        }

    }

    @FXML
    private void clear() {
        borderPane.setCenter(null);
    }

    @FXML
    private void loadFXML(String fileName) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("/view/" + fileName + ".fxml"));
            borderPane.setCenter(parent);

        } catch (IOException ex) {
            Logger.getLogger(MainPanelController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void close() throws IOException {

        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("/view/LoginView.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("User Login");
        stage.getIcons().add(new Image("/asset/icon.png"));
        stage.show();
    }

    @FXML
    private void loadPage01View(ActionEvent e) {
        loadFXML("Page01View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadPage02View(ActionEvent e) {
        loadFXML("Page02View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadPage03View(ActionEvent e) {
        loadFXML("Page03View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadPage04View(ActionEvent e) {
        loadFXML("Page04View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadPage05View(ActionEvent e) {
        loadFXML("Page05View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadPage06View(ActionEvent e) {
        loadFXML("Page06View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadPage07View(ActionEvent e) {
        loadFXML("Page07View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadPage08View(ActionEvent e) {
        loadFXML("Page08View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadPage09View(ActionEvent e) {
        loadFXML("Page09View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadPage10View(ActionEvent e) {
        loadFXML("Page10View");
        changeButtonBackground(e);
    }

    @FXML
    private void loadHomeView(ActionEvent e) {
        loadFXML("HomeView");
        changeButtonBackground(e);
    }
}
