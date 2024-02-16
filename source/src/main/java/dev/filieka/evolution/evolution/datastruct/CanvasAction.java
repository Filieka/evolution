package dev.filieka.evolution.evolution.datastruct;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CanvasAction {
    public static void drawBoard(Canvas canvas,Board board,int cellSize){
        clear(canvas);
        drawGrid(canvas,cellSize);
        // draw canvas
        boolean[][] arr = board.getBoardData();
        int numRows = arr.length;
        int numCols = arr[0].length;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (arr[row][col]) {
                    drawOneCell(canvas, row, col, cellSize);
                }
            }
        }
    }

    private static void drawOneCell(Canvas canvas,int row,int column,int cellSize){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // Calculate the position and size of the cell
        double x = column * cellSize;
        double y = row * cellSize;
        double width = cellSize;
        double height = cellSize;

        // Set the fill color (you can modify this as needed)
        gc.setFill(Color.BLUE);

        // Draw a filled rectangle in the specified cell
        gc.fillRect(x, y, width, height);
    }

    private static void drawGrid(Canvas canvas,int cellSize){
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double canvasWidth = canvas.getWidth();
        double canvasHeight = canvas.getHeight();

        // Set the color of the grid lines (you can modify this as needed)
        gc.setStroke(Color.BLACK);

        // Draw vertical lines
        for (double x = 0; x <= canvasWidth; x += cellSize) {
            gc.strokeLine(x, 0, x, canvasHeight);
        }

        // Draw horizontal lines
        for (double y = 0; y <= canvasHeight; y += cellSize) {
            gc.strokeLine(0, y, canvasWidth, y);
        }
    }

    public static void clear(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // 清空一個與Canvas大小相同的矩形區域
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}
