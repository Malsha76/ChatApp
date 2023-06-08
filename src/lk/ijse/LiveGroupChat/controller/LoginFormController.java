package lk.ijse.LiveGroupChat.controller;


import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public static String UserName;

    @FXML
    private AnchorPane pane;
    @FXML
    private JFXTextField txtUserName;

    @FXML
    void btnStartedOnAction(ActionEvent event) throws IOException {
        UserName = txtUserName.getText();
        Stage stagee = new Stage();
        try {
            stagee.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/LiveGroupChat/view/ClientForm.fxml"))));
            stagee.show();
            stagee.setMaximized(false);
            stagee.setResizable(false);
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        txtUserName.clear();

    }


}
