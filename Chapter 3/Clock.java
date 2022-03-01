public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour <= 23) {
            this.hour = hour;
        }   
        else{
            setHour(0);
            setSecond(0);
            setMinute(0);
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            setHour(0);
            setMinute(0);
            setSecond(0);
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            setHour(0);
            setMinute(0);
            setSecond(0);
        }
    }

    public void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
