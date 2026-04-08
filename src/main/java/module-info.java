module org.example.appcominterface {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.appcominterface to javafx.fxml;
    exports org.example.appcominterface;
}