module com.kensoftph.textfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.textfield to javafx.fxml;
    exports com.kensoftph.textfield;
}