public class Datetest {
    public static void main(String[] args) {
        Date myDate = new Date(3, 15, 2025); 

        System.out.print("Original date: ");
        myDate.displayDate();

        myDate.setMonth(6);
        myDate.setDay(27);
        myDate.setYear(2025);

        System.out.print("Updated date: ");
        myDate.displayDate();
    }
}
