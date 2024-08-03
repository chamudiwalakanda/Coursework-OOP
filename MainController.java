package Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController{

    @FXML
    private AnchorPane root;

    @FXML
    void btnBooks(ActionEvent event) throws Exception {
        System.out.println("Books botton clicked");
        Parent root= FXMLLoader.load(getClass().getResource("/View/Book.fxml"));
        Stage stage=new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Book Form");
    }

    @FXML
    void btnBorrow(ActionEvent event) {

    }

    @FXML
    void btnMembers(ActionEvent event)throws Exception {
        System.out.println("Member botton clicked");
        Parent root= FXMLLoader.load(getClass().getResource("/View/Member.fxml"));
        Stage stage=new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        stage.setTitle("Member Form");
}

@FXML
void btnReturn(ActionEvent event){
    
}

}