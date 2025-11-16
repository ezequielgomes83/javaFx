module javafx2 {
    requires javafx.controls;
    requires javafx.fxml;

    exports gui to javafx.fxml;
    exports application to javafx.graphics;
    opens gui to javafx.fxml;
}