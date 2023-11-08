public class TestTime {

    public static void main(String[] args) {
        Time t1 = new Time();
        t1.hours = 10;
        t1.minutes = 20;
        Time t2 = new Time();
        t2.hours = 13;
        t2.minutes = 44;
        Time t3 = t1.addTime(t2);
        System.out.println(t1.hours + ":"+t1.minutes);
        System.out.println(t3.hours + ":"+t3.minutes);
    }
}

class Time
{
    int hours;
    int minutes;

    public Time addTime(Time otherTime)
    {
        Time temp = new Time();
        this.hours += otherTime.hours;
        this.minutes += otherTime.minutes;
        if (this.minutes > 59)
        {
            this.minutes -=60;
            this.hours += 1;
        }
        if (this.hours > 23)
        {
            this.hours -= 24;
        }
        temp.hours = this.hours;
        temp.minutes = this.minutes;
        return temp;
    }
}
