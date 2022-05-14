package revision;

public class Hourly_Employee extends Employee implements Displayable{
    private double hour_rate;
    private int number_of_hours;

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public void setNumber_of_hours(int number_of_hours) {
        this.number_of_hours = number_of_hours;
    }

    public int getNumber_of_hours() {
        return number_of_hours;
    }

    public Hourly_Employee(String name, String address, int ssn, Gender sex, double hour_rate, int number_of_hours) {
        super(name, address, ssn, sex);
        this.hour_rate = hour_rate;
        this.number_of_hours = number_of_hours;
    }

    @Override
    public  double earnings(){
        return number_of_hours*hour_rate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +"Salary"+earnings()+
                ", hour_rate=" + hour_rate +
                ", number_of_hours=" + number_of_hours +
                '}';
    }
    public void Display_Earnings(){
        System.out.println("Earnings = "+earnings());
    }
    public void Display_All_Details(){
        System.out.println(super.toString());
        System.out.println(toString());

    }

}
