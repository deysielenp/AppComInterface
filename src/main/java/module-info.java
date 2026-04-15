module org.example.appcominterface {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens org.example.appcominterface to javafx.fxml;
    exports org.example.appcominterface;
}