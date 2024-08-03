package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Perform login validation here
        if ("admin".equals(username) && "password".equals(password)) {
            System.out.println("Login successful");
            // Navigate to the main application screen
        } else {
            System.out.println("Login failed");
        }
    }
}