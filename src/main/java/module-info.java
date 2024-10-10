module com.example.sesion9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sesion9 to javafx.fxml;
    exports com.example.sesion9;
}