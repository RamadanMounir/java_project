package revision;

public class Base_Plus_commission_Employee extends Commission_Employee{

    private double base_Salary;

    public void setBase(double base_Salary){
        this.base_Salary=base_Salary;
    }
    public double getBase_Salary(){
        return base_Salary;
    }

    public Base_Plus_commission_Employee(String name, String address, int ssn, Gender sex, double gross_sales, double commission_rate, double base_Salary) {
        super(name, address, ssn, sex, gross_sales, commission_rate);
        this.base_Salary = base_Salary;
    }

    @Override
    public double earnings(){
        return base_Salary+super.earnings();
    }

    @Override
    public void Display_Earnings(){
        System.out.println("Earnings = "+earnings());
    }
    @Override
    public void Display_All_Details(){
        super.Display_All_Details();
        Display_Earnings();

    }
}
