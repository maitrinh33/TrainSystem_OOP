module RailwaySystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    exports Controllers;
    opens view to javafx.fxml;
}
