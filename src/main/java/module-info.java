module nl.inholland.catstate {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;


    opens nl.inholland.catstate to javafx.fxml;
    exports nl.inholland.catstate;
}