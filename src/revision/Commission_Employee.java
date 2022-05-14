package revision;

public class Commission_Employee extends Employee implements Displayable{
    private double gross_sales;
    private double commission_rate;

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getGross_sales() {
        return gross_sales;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public Commission_Employee(String name, String address, int ssn, Gender sex, double gross_sales, double commission_rate) {
        super(name, address, ssn, sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }

    @Override
    public double earnings(){
       return gross_sales*commission_rate;
    }

    @Override
    public String toString() {
        return "Commission_Employee{" +
                "gross_sales=" + gross_sales +
                ", commission_rate=" + commission_rate +
                '}';
    }

@Override
    public void Display_Earnings(){
        System.out.println("Earnings = "+earnings());
    }
    @Override
    public void Display_All_Details(){
        System.out.println(super.toString());
        System.out.println(toString());

    }
}
