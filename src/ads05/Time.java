package ads05;

public class Time {

    private int hour, minute, second;

    // DEFINING GETTERS AND SETTERS FOR PRIVATE ATTRIBUTES:

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 12)
            this.hour = hour;
        else {
            System.out.println("Invalid hour.");
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59)
            this.minute = minute;
        else {
            System.out.println("Invalid minute.");
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59)
            this.second = second;
        else {
            System.out.println("Invalid second.");
        }

    }

}