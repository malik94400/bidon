module sio.essaigithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.essaigithub to javafx.fxml;
    exports sio.essaigithub;
}