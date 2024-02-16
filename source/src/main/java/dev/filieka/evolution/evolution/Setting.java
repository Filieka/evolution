package dev.filieka.evolution.evolution;

public class Setting {
    private int cellSize;
    private float timeInterval;

    public Setting(int cellSize,float timeInterval){
        this.cellSize=cellSize;
        this.timeInterval=timeInterval;
    }

    public int getCellSize() {
        return cellSize;
    }

    public float getTimeInterval(){
        return timeInterval;
    }

    public void plusTimeInterval(){
        this.timeInterval+=0.1;

        if(this.timeInterval>=1.0){
            this.timeInterval=(float)1.0;
        }
    }

    public void minusTimeInterval(){
        this.timeInterval-=0.1;

        if(this.timeInterval<=0.1){
            this.timeInterval=(float)0.1;
        }
    }

}
