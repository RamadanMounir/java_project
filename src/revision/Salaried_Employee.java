package revision;

public class Salaried_Employee extends Employee implements Displayable{
    double salary;
    double bonus;
    double deductios;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setDeductios(double deductios) {
        this.deductios = deductios;
    }

    public double getDeductios() {
        return deductios;
    }

    public Salaried_Employee(){

    }

    public Salaried_Employee(String name, String address, int ssn, Gender sex, double salary, double bonus, double deductios) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductios = deductios;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", deductios=" + deductios +
                '}';
    }

    @Override
    public double earnings(){
        return (salary+bonus)-deductios;
    }

    @Override
    public void Display_Earnings(){
        System.out.println("Earnings = "+earnings());

    }

    public void Display_All_Details(){
        System.out.println(super.toString());
        System.out.println(toString());
    }

}
