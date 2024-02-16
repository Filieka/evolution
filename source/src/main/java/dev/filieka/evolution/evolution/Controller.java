package dev.filieka.evolution.evolution;

import dev.filieka.evolution.evolution.datastruct.Board;
import dev.filieka.evolution.evolution.datastruct.CanvasAction;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {
    private Setting setting;
    private Model model;

    public Controller(Model model,Setting setting) {
        this.setting = setting;
        this.model = model;
    }

    @FXML
    private void initialize() {
        // TODO: @FXML 注入後執行的初始化
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }

    // 以下是視窗的原件，包含button和canvas
    @FXML
    private Canvas canvas;
    @FXML
    private TextArea repeatTimeText;
    @FXML
    private Button enterButton;
    @FXML
    private Button startButton;
    @FXML
    private Button pauseButton;
    @FXML
    private Button nextButton;
    @FXML
    private Button undoButton;
    @FXML
    private Button plusButton;
    @FXML
    private Button minusButton;
    @FXML
    private Text timeIntervalText;
    @FXML
    private Button grid3Button;
    @FXML
    private Button grid5Button;
    @FXML
    private Button grid6Button;
    @FXML
    private Button grid10Button;
    @FXML
    private Button grid15Button;
    @FXML
    private Button grid25Button;
    @FXML
    private Button grid50Button;
    @FXML
    private Button grid75Button;
    @FXML
    private Button grid125Button;

    // 以下是元件被觸發會做的事
    @FXML
    protected void enterRepeatTime() {
        System.out.println("enter 執行");
    }
    @FXML
    protected void startRun(){
        System.out.println("start 執行");
    }
    @FXML
    protected void pauseAll(){
        System.out.println("pause 執行");
    }
    @FXML
    protected void nextStep(){
        System.out.println("next 執行");
        Board board=this.model.getNowBoard();
        board.evolution(canvas,this.setting.getCellSize());
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }
    @FXML
    protected void lestStep(){
        System.out.println("undo 執行");
    }
    @FXML
    protected void plusTimeInterval(){
        System.out.println("plus 執行");
        this.setting.plusTimeInterval();
        timeIntervalText.setText(String.format("%.1f",(this.setting.getTimeInterval())));
    }
    @FXML
    protected void minusTimeInterval(){
        System.out.println("minus 執行");
        this.setting.minusTimeInterval();
        timeIntervalText.setText(String.format("%.1f",(this.setting.getTimeInterval())));
    }
    @FXML
    protected void canvasClicked(MouseEvent event){
        System.out.println("click 執行");
        int clickedX = (int) event.getY(); // 點擊的x座標
        int clickedY = (int) event.getX(); // 點擊的y座標
        //坐標系方向問題
        int row = clickedX/this.setting.getCellSize();
        int column = clickedY/this.setting.getCellSize();

        Board board = this.model.getNowBoard();
        board.setBoardData(row,column,!board.getBoardData()[row][column]);

        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }
    @FXML
    protected  void setGridSize3(){
        System.out.println("grid3 執行");
        this.setting.setCellSize(250);
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }

    @FXML
    protected  void setGridSize5(){
        System.out.println("grid5 執行");
        this.setting.setCellSize(150);
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }
    @FXML
    protected  void setGridSize6(){
        System.out.println("grid6 執行");
        this.setting.setCellSize(125);
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }
    @FXML
    protected  void setGridSize10(){
        System.out.println("grid10 執行");
        this.setting.setCellSize(75);
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }
    @FXML
    protected  void setGridSize15(){
        System.out.println("grid15 執行");
        this.setting.setCellSize(50);
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }
    @FXML
    protected  void setGridSize25(){
        System.out.println("grid25 執行");
        this.setting.setCellSize(30);
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }
    @FXML
    protected  void setGridSize30(){
        System.out.println("grid30 執行");
        this.setting.setCellSize(25);
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }
    @FXML
    protected  void setGridSize50(){
        System.out.println("grid50 執行");
        this.setting.setCellSize(15);
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }
    @FXML
    protected  void setGridSize75(){
        System.out.println("grid75 執行");
        this.setting.setCellSize(10);
        CanvasAction.drawBoard(canvas,this.model.getNowBoard(),this.setting.getCellSize());
    }


}
