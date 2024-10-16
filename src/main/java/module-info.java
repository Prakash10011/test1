module com.example.thapa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thapa to javafx.fxml;
    exports com.example.thapa;
}