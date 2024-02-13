module dev.filieka.evolution.evolution {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.filieka.evolution.evolution to javafx.fxml;
    exports dev.filieka.evolution.evolution;
}