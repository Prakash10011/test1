package com.example.thapa;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    private int attemptCount = 0;
    private static final String USERNAME = "Prakash";
    private static final String PASSWORD = "456";

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please Provide Username or Password.");
            return;
        }

        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            messageLabel.setText("Success!!!");
            attemptCount = 0; // Reset count on successful login
        } else {
            attemptCount++;
            messageLabel.setText("Sorry, Invalid Username or Password");
            if (attemptCount >= 5) {
                messageLabel.setText("Sorry, Your Account is Locked!!!");
            }
        }
    }
}
