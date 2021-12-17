module com.example.pr88 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr88 to javafx.fxml;
    exports com.example.pr88;
}