package doItJava;

class MyDate{
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate) {
            MyDate date = (MyDate) obj;
            if(this.day == date.day && this.month == date.month && this.year == date.year) return true;
            else return false;
        }
        return false;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
    MyDate date1 = new MyDate(2,4,2023);
    MyDate date2 = new MyDate(2,4,2023);

        System.out.println(date1 == date2); // false false
        System.out.println(date1.equals(date2)); // false true
    }
}
