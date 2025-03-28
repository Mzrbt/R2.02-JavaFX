module tp1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens tp1 to javafx.fxml;
    exports tp1;
}
