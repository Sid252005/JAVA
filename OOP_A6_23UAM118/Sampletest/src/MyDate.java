public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year; 
        
    }

    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
