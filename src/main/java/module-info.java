module org.example.appcominterface {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.appcominterface to javafx.fxml;
    exports org.example.appcominterface;
}