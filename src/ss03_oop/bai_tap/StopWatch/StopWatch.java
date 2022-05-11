package ss03_oop.bai_tap.StopWatch;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start(){
        setStartTime(System.currentTimeMillis());
    }
    public void end(){
        setEndTime(System.currentTimeMillis());
    }
    public long getElapsedTime(){
        return getEndTime()- getStartTime();
    }


}


