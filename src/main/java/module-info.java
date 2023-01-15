module com.example.kollokvium2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kollokvium2 to javafx.fxml;
    exports com.example.kollokvium2;
}