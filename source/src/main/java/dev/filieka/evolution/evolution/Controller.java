package dev.filieka.evolution.evolution;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    @FXML
    private void initialize() {
        // TODO: @FXML 注入後執行的初始化
    }

    // 以下是視窗的原件，包含button和canvas
    @FXML
    private Button butt;
    @FXML
    private TextArea text;

    // 以下是元件被觸發會做的事
    @FXML
    protected void testfunction() {
        System.out.println("testfunction 執行");
        text.setText("butt 被點擊");
    }
}
