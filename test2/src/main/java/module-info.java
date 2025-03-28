module test2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens test2 to javafx.fxml;
    exports test2;
}
