module org.example.gui1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.gui1 to javafx.fxml;
    exports org.example.gui1;
}